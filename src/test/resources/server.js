const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

// Connect to MongoDB
mongoose.connect('mongodb://localhost:27017/studentDB', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

// Define a Student schema
const studentSchema = new mongoose.Schema({
  id: String,
  name: String,
  skill: [String],
  batch: String,
});

const Student = mongoose.model('students', studentSchema);

app.get('/api/students', async (req, res) => {
  const students = await Student.find();
  res.json(students);
});

app.get('/api/students/:id', async (req, res) => {
  const student = await Student.findOne({ id: req.params.id });
  res.json(student);
});

app.post('/api/students', async (req, res) => {
  const newStudent = new Student(req.body);
  await newStudent.save();
  res.json(newStudent);
});

app.put('/api/students/:id', async (req, res) => {
  const updatedStudent = await Student.findOneAndUpdate({ id: req.params.id }, req.body, { new: true });
  res.json(updatedStudent);
});

app.delete('/api/students/:id', async (req, res) => {
  await Student.findOneAndDelete({ id: req.params.id });
  res.json({ message: 'Student deleted' });
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
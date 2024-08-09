package Utilities;

import com.mongodb.client.*;

import javax.swing.text.Document;
import java.util.Iterator;

public class DatabaseUtil {
    public void connect(){
        String connectionURL = "mongodb://localhost:27017/";
        MongoClient mongoClient = MongoClients.create(connectionURL);
        MongoDatabase database = mongoClient.getDatabase("studentDB");
        MongoCollection collection = database.getCollection("Student");
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

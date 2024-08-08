package Common;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJSON {
    public JSONArray readJSONFile() throws FileNotFoundException {
        File file = new File("src/test/resources/text.json");
        FileReader fileReader = new FileReader(file);
        JSONTokener jsonTokener = new JSONTokener(fileReader);
        JSONObject jsonObject = new JSONObject(jsonTokener);
        return jsonObject.getJSONArray("students");
    }
}

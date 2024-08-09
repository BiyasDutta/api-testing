package HTTPRequests;

import Common.SetData;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class DeleteRequest {

    private static SetData setData;
    String lastId;

    DeleteRequest(){
        setData = new SetData();
    }

    @Test
    void deleteUser() throws FileNotFoundException {
        given().when().delete("http://localhost:3000/students/" + setData.lastID())
                .then().statusCode(200);
        System.out.print("Deleted");
    }
}

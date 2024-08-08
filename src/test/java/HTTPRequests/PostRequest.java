package HTTPRequests;

import Common.SetData;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import static io.restassured.RestAssured.given;

public class PostRequest {

    private static SetData setData;

    PostRequest() {
        setData = new SetData();
    }

    @Test(priority = 3)
    void createNewUser() throws FileNotFoundException {


        given().contentType("application/json").body(setData.setRandomData())

                .when().post("http://localhost:3000/students")

                .then().statusCode(201);
        System.out.println("Created");

    }

}

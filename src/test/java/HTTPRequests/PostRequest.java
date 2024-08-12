package HTTPRequests;

import common.SetData;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {

    private static SetData setData;

    public PostRequest() {
        setData = new SetData();
    }

    public void createNewUser() {
        given().contentType("application/json").body(setData.setRandomData())

                .when().post("http://localhost:8081/api/students")

                .then().statusCode(201);
        System.out.println("Created");

    }

}

package HTTPRequests;

import common.SetData;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostRequest {

    private static SetData setData;

    public PostRequest() {
        setData = new SetData();
    }

    public Response createNewUser() {
        Response response = given().contentType("application/json").body(setData.setRandomData())

                .when().post("http://localhost:8081/api/students");


        response.then().statusCode(201);

        return response;

    }

}

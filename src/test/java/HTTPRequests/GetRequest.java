package HTTPRequests;

import common.Config;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

    public Response getAllUsers() {
        Response response = given()

                .when().get("http://localhost:8081/api/students");

        response.then().statusCode(200);

        return response;
    }

    public Response getSpecificUser() {
        Response response = given()

                .when().get("http://localhost:8081/api/students/" + Config.getID());

        response.then().statusCode(200).log().body();

        response.then().assertThat().body("id", equalTo(Config.getID()));

        return response;

    }

}

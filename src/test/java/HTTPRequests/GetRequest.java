package HTTPRequests;

import common.Config;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

    public void getAllUsers() {
        given()

                .when().get("http://localhost:8080/api/students")

                .then().statusCode(200).log().body();

        System.out.println("All users found");
    }

    public void getSpecificUser() {
        Response response = given()

                .when().get("http://localhost:8080/api/students/" + Config.getID());

        response.then().statusCode(200).log().body();

        response.then().assertThat().body("id", equalTo(Config.getID()));

        System.out.println("Created user found");

    }

}

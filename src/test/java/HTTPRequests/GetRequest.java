package HTTPRequests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

    @Test(priority = 1)
    void getAllUsers() {
        given()

                .when().get("http://localhost:3000/students")

                .then().statusCode(200).log().body();

        System.out.println("All users found");
    }

    @Test(priority = 2)
    void getSpecificUser() {
        Response response = given()

                .when().get("http://localhost:3000/students/2");

        response.then().statusCode(200).log().body();

        response.then().assertThat().body("id", equalTo("2"));

        System.out.println("Second user found");

    }

}

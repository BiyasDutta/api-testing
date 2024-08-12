package HTTPRequests;

import common.Config;
import common.SetData;

import static io.restassured.RestAssured.given;

public class DeleteRequest {

    private static SetData setData;

    public DeleteRequest() {
        setData = new SetData();
    }

    public void deleteUser() {
        given().when().delete("http://localhost:8080/api/students/" + Config.getID())
                .then().statusCode(204);
        System.out.print("Deleted");
    }
}

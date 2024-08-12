package HTTPRequests;

import common.Config;
import common.POJO;
import common.SetData;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutRequest {
    private static SetData setData;
    private static POJO data;

    public PutRequest() {
        setData = new SetData();
        data = new POJO();
    }

    public Response updateUser() {
        Response response = given().contentType("application/json").body(createData())

                .when().put("http://localhost:8081/api/students/" + Config.getID());

        response.then().statusCode(201);

        return response;
    }

    POJO createData() {
        data.setName(setData.randomName());
        data.setSkill(setData.randomSkill());
        data.setBatch(setData.randomYear());
        return data;
    }

}

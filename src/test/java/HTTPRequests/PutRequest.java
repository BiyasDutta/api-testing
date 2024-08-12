package HTTPRequests;

import common.Config;
import common.POJO;
import common.SetData;

import static io.restassured.RestAssured.given;

public class PutRequest {
    private static SetData setData;
    private static POJO data;

    public PutRequest() {
        setData = new SetData();
        data = new POJO();
    }

    public void updateUser() {
        given().contentType("application/json").body(createData())

                .when().put("http://localhost:8081/api/students/" + Config.getID())

                .then().statusCode(201).log().all();
        System.out.println("Updated");

    }

    POJO createData() {
        data.setName(setData.randomName());
        data.setSkill(setData.randomSkill());
        data.setBatch(setData.randomYear());
        System.out.println(data);
        return data;
    }

}

package HTTPRequests;

import Common.SetData;
import Common.POJO;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class PutRequest {
    private static SetData setData;
    private static POJO data;
    String lastId;

    PutRequest(){
        setData = new SetData();
        data = new POJO();
    }

    @Test
    void updateUser() throws FileNotFoundException {

        given().contentType("application/json").body(createData())

                .when().put("http://localhost:3000/students/" + setData.lastID())

                .then().statusCode(200).log().all();
        System.out.println("Updated");

    }

    POJO createData() throws FileNotFoundException {
        data.setName(setData.randomName());
        data.setSkill(setData.randomSkill());
        data.setBatch(setData.randomYear());
        System.out.println(data);
        return data;
    }

}

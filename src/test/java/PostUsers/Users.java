package PostUsers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Users {



    @Test
    public void PostUser(){
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.contentType(ContentType.JSON).accept(ContentType.JSON)
                .body("{\n" +
                "    \"name\": \"Fionna\",\n" +
                "    \"job\": \"Manager\"\n" +
                "}").post();
        System.out.println();
        System.out.println("Status Code: "+response.statusCode());
        System.out.println();
        System.out.println("RESPONSE: "+response.asPrettyString());
        System.out.println();


        Assert.assertEquals(response.getStatusCode(), 201);






    }
}

package GetUsers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Users {


    @Test
    public void GetUsers(){


        String URL = "https://reqres.in/api/users?page=2";
        RestAssured.baseURI = URL;
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.accept(ContentType.JSON).get();



        System.out.println();
        System.out.println("Status Code: "+response.statusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println();
        System.out.println("Status Line: "+response.statusLine());
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
        System.out.println();
        System.out.println("RESPONSE: "+response.asPrettyString());
    }
}

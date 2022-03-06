package support;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class apihelper {
    public Response Get(String url){
        Response response = given().get(url);
        return response;
    }

}

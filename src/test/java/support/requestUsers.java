package support;

import io.restassured.response.Response;

public class requestUsers {
    apihelper api;
    public static Response responseuser;
    public requestUsers(){
        api=new apihelper();
    }
    public void getUsers(){
        String url="https://reqres.in/api/users";
        responseuser=api.Get(url);
    }
}

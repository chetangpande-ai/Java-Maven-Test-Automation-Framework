package com.framework.libs;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API {

    private static final String BASE_URL = "https://dummy.restapiexample.com/api/v1";

    // GET request
    public static Response getEmployee(int id) {
        return RestAssured
                .given()
                .when()
                .get(BASE_URL + "/employee/" + id);
    }

    // POST request
    public static Response createEmployee(String name, String salary, String age) {
        String body = "{ \"name\":\"" + name + "\", \"salary\":\"" + salary + "\", \"age\":\"" + age + "\" }";

        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(BASE_URL + "/create");
    }

    // DELETE request
    public static Response deleteEmployee(int id) {
        return RestAssured
                .given()
                .when()
                .delete(BASE_URL + "/delete/" + id);
    }
}

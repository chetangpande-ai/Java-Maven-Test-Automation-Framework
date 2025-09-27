package com.framework.tests;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.libs.API;

public class APITests {

    @Test
    public void testCreateEmployee() {
        Response response = API.createEmployee("John Doe", "50000", "30");
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println("Response: " + response.asString());
    }

    @Test
    public void testGetEmployee() {
        Response response = API.getEmployee(1);
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println("Response: " + response.asString());
    }
}

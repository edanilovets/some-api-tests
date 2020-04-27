package io.chucknorris.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @Test
    void canGetRandomJokeTest(){
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("--- The response ---");
        response.prettyPrint();
    }
}

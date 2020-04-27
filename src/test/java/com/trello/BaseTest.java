package com.trello;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @BeforeAll
    static void setUp(){
        RestAssured.baseURI = "https://api.trello.com/";
        RestAssured.basePath = "1/";
    }
}

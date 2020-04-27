package com.trello.conditions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class StatusCodeCondition implements Condition{

    private final Integer expectedStatusCode;

    public StatusCodeCondition(Integer expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
    }

    @Override
    public void check(Response response) {
        response.then().assertThat().statusCode(expectedStatusCode);
    }

    @Override
    public String toString() {
        return "StatusCode = " + expectedStatusCode;
    }
}

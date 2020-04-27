package com.trello.assertions;

import com.trello.conditions.Condition;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class AssertableResponse {
    private final Response response;

    public AssertableResponse(Response response) {
        this.response = response;
    }

    @Step("API response should have {condition}")
    public AssertableResponse shouldHave(Condition condition){
        condition.check(response);
        return this;
    }

    // To have ability to save values of type String from JSON
    // For other types see getInteger etc.
    @Step
    public String getValue(String path) {
        return response.jsonPath().getObject(path, String.class);
    }

    @Step
    public Integer getInteger(String path) {
        return response.jsonPath().getInt(path);
    }

    //If response as JSON
    @Step
    public <T> T asPojo(Class<T> tClass) {
        return response.as(tClass);
    }
}

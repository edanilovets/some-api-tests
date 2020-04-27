package com.trello.conditions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matcher;
import org.junit.platform.commons.util.StringUtils;

public class BodyFieldCondition implements Condition{
    private final String path;
    private final Matcher matcher;

    public BodyFieldCondition(String path, Matcher matcher){
        this.path = path;
        this.matcher = matcher;
    }

    @Override
    public void check(Response response) {
        if (StringUtils.isBlank(path)) {
            response.then().body(matcher);
        } else {
            response.then().body(path, matcher);
        }

    }

    @Override
    public String toString() {
        if (StringUtils.isBlank(path)) {
            return "Body: " + matcher;
        } else {
            return "Body: " + path + " " + matcher;
        }

    }


}
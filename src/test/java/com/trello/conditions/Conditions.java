package com.trello.conditions;

import org.hamcrest.Matcher;

public final class Conditions {
    public static StatusCodeCondition statusCode(int code){
        return new StatusCodeCondition(code);
    }
    public static BodyFieldCondition body(String path, Matcher matcher) {
        return new BodyFieldCondition(path, matcher);
    }

    public static BodyFieldCondition body(Matcher matcher) {
        return new BodyFieldCondition(null, matcher);
    }
}

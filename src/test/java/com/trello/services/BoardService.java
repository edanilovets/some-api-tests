package com.trello.services;

import com.trello.assertions.AssertableResponse;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

public class BoardService extends ApiService {

    @Step("Get Board with id {boardId}")
    public AssertableResponse getBoard(String boardId){
        return new AssertableResponse(setup()
                .param("key", trelloUserService.getKey())
                .param("token", trelloUserService.getToken())
                .when()
                .get("boards/" + boardId));
    }
}

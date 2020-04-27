package com.trello;

import static com.trello.conditions.Conditions.*;
import com.trello.services.BoardService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.is;

public class BoardTests extends BaseTest {

    private final BoardService boardService = new BoardService();

    @Test
    void canGetABoard(){

        String boardId = "5e9442e86a23fc6a3e6361e3"; // Vacation Planning board

        boardService.getBoard(boardId)
            .shouldHave(statusCode(200))
            .shouldHave(body("id", is(boardId)))
            .shouldHave(body("closed", is(false)))
            .shouldHave(body("name", equalTo("Vacation Planning")));
    }

    @Test
    void canUpdateBoard(){

    }

    @Test
    void canDeleteBoard(){

    }
}

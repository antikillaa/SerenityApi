package impl;

import context.TestProperties;
import io.restassured.response.ValidatableResponse;
import model.Article;
import service.ArticlesService;

import java.util.List;

import static context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

public class ArticlesServiceImpl implements ArticlesService {
    static TestProperties testProperties = new TestProperties();

    @Override
    public List<Article> getListArticles() {
        String URL = testProperties.getURL() + "/articles.json";

        return given().log().everything(true)
                .get(URL).then()
                .log().ifError()
                .extract()
                .jsonPath().getList("articles.", Article.class);
    }

    @Override
    public void getListArticles(String url, int status) {
        String URL = testProperties.getURL() + url;

        given().log().everything(true)
                .get(URL)
                .then()
                .statusCode(status)
                .log().ifError();
    }
}

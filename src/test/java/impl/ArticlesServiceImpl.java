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
    public List<Article> getArticles() {
        String URL = testProperties.getURL() + "/articles.json";

        ValidatableResponse r = given().log().everything(true)
                        .get(URL)
                        .then()
                .log().ifError();

        RUN_CONTEXT.put("response", r);

        List<Article> articles = r.extract().jsonPath().getList("articles.", Article.class);

        return articles;
    }

    @Override
    public void getArticles(String url, int status) {
        String URL = testProperties.getURL() + url;

        ValidatableResponse r = given().log().everything(true)
                .get(URL)
                .then()
                .statusCode(status)
                .log().ifError();

    }
}

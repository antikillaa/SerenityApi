package impl;

import context.TestProperties;
import model.Article;
import service.ArticlesService;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ArticlesServiceImpl implements ArticlesService {
    static TestProperties testProperties = new TestProperties();

    @Override
    public List<Article> getArticles() {
        String URL = testProperties.getURL() + "/articles.json";
        List<Article> articles = given().log().everything(true)
                .get(URL)
                .then().statusCode(200)
                .extract().jsonPath().getList("articles.", Article.class);
        return articles;
    }
}

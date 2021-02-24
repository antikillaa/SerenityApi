package steps;

import impl.ArticlesServiceImpl;
import io.cucumber.java.en.Given;
import model.Article;
import org.junit.Assert;
import service.ArticlesService;

import java.util.List;

public class ArticlesStepdefs {

    ArticlesService articlesService = new ArticlesServiceImpl();

    @Given("Get Articles List Request")
    public void getArticlesRequest() {
        List<Article> articles = articlesService.getListArticles();
        Assert.assertTrue(articles.size() > 0);
    }

    @Given("Get Articles {string} Request and get response with {string} code")
    public void getArticlesRequestAndGetResponseWithCode(String url, String status) {
        articlesService.getListArticles(url, Integer.parseInt(status));
    }
}

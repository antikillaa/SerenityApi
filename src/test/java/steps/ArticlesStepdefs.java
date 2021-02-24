package steps;

import impl.ArticlesServiceImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import model.Article;
import org.junit.Assert;
import service.ArticlesService;

import java.util.List;

import static context.RunContext.RUN_CONTEXT;

public class ArticlesStepdefs {

    ArticlesService articlesService = new ArticlesServiceImpl();

    @Given("Get Articles List Request")
    public void getArticlesRequest() {
        List<Article> articles = articlesService.getListArticles();
        Assert.assertTrue(articles.size() > 0);
        RUN_CONTEXT.put("articles", articles);
    }

    @Given("Get Articles {string} Request and get response with {string} code")
    public void getArticlesRequestAndGetResponseWithCode(String url, String status) {
        articlesService.getListArticles(url, Integer.parseInt(status));
    }

    @And("check that Posts have filled Url, Lang and Title")
    public void checkThatArticlesHaveFilledUrlLangAndTitle() {
        List<Article> articles = RUN_CONTEXT.get("articles", List.class);

        articles.forEach(article -> {
            Assert.assertNotNull(article.getUrl());
            Assert.assertNotNull(article.getLang());
            Assert.assertNotNull(article.getTitle());
        });

    }
}

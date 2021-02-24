package steps;

import impl.ArticlesServiceImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import service.ArticlesService;

public class ArticlesStepdefs {

    ArticlesService articlesService = new ArticlesServiceImpl();

    @Given("Sent generate a new password")
    public void sentGenerateANewPassword(DataTable datatable) {
        System.out.println("test");
    }

    @Given("Get Articles Request")
    public void getArticlesRequest() {
        articlesService.getArticles();
    }

    @Given("Get Articles {string} Request and get response with {string} code")
    public void getArticlesRequestAndGetResponseWithCode(String url, String status) {
        articlesService.getArticles(url, Integer.parseInt(status));
    }
}

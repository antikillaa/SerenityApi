package steps;

import impl.ArticlesServiceImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import service.ArticlesService;

public class GeneratePasswordStepdefs {

    ArticlesService articlesService = new ArticlesServiceImpl();

    @Given("Sent generate a new password")
    public void sentGenerateANewPassword(DataTable datatable) {
        System.out.println("test");
    }

    @Given("Get Articles Request")
    public void getArticlesRequest() {
        articlesService.getArticles();
    }
}

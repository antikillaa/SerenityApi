package us.peshkur.service;

import us.peshkur.model.Article;

import java.util.List;

public interface ArticlesService {
    List<Article> getListArticles();

    void getListArticles(String url, int parseInt);
}

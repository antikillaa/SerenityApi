package service;

import model.Article;

import java.util.List;

public interface ArticlesService {
    List<Article> getListArticles();

    void getListArticles(String url, int parseInt);
}

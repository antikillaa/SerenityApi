package service;

import model.Article;

import java.util.List;

public interface ArticlesService {
    List<Article> getArticles();

    void getArticles(String url, int parseInt);
}

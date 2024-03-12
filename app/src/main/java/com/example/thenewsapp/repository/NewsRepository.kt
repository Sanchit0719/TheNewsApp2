package com.example.thenewsapp.repository

import com.example.thenewsapp.api.RetroFitInstance
import com.example.thenewsapp.db.ArticleDatabase
import com.example.thenewsapp.models.Article
import java.util.Locale.IsoCountryCode

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetroFitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetroFitInstance.api.searchForNews(searchQuery, pageNumber)

        suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

        fun getFavouriteNews() = db.getArticleDao().getALLArticles()

        suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}
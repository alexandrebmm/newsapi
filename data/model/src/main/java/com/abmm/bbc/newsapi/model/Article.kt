package com.abmm.bbc.newsapi.model

data class ArticlesResponseDTO(
    val status: String?,
    val totalResult: Int?,
    val articles: List<ArticleDTO>,
)

data class ArticleDTO(
    val source: SourceDTO?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?,
)

data class SourceDTO(
    val id: String?,
    val name: String?,
)
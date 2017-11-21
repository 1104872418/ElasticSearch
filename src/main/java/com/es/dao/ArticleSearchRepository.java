package com.es.dao;

import com.es.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}

package com.es.dao;

import com.es.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookSearchRepository extends ElasticsearchRepository<Article, Long> {
}

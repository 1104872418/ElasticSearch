package com.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "projectname", type = "book", indexStoreType = "fs", shards = 5, replicas = 1, refreshInterval = "-1")
public class Book implements Serializable {
    @Id
    private Long id;
    /**
     * 书名/
     * private String bookName;
     * /**书籍内容
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

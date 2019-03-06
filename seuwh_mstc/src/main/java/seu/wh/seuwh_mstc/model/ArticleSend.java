/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.model;

import java.util.Date;
import java.util.List;

public class ArticleSend {
    //后端响应前端请求
    private Integer id;
    private String title;
    private Integer commentcount=0;
    private Integer viewcount=0;
    private String summary="";
    private User author;
    private List<ArticleTag> tags;
    private Category category;
    private Date publishtime;
    private ArticleBody body;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<ArticleTag> getTags() {
        return tags;
    }

    public void setTags(List<ArticleTag> tags) {
        this.tags = tags;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public ArticleBody getBody() {
        return body;
    }

    public void setBody(ArticleBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArticleSend{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", commentcount=" + commentcount +
                ", viewcount=" + viewcount +
                ", summary='" + summary + '\'' +
                ", author=" + author +
                ", tags=" + tags +
                ", category=" + category +
                ", publishtime=" + publishtime +
                ", body=" + body +
                '}';
    }
}

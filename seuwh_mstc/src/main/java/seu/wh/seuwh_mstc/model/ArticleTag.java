/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.model;

public class ArticleTag {
    private Integer id;
    private Integer articleid;
    private Integer tagid;
    private String tagdescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public String getTagdescription() {
        return tagdescription;
    }

    public void setTagdescription(String tagdescription) {
        this.tagdescription = tagdescription;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
                "id=" + id +
                ", articleid=" + articleid +
                ", tagid=" + tagid +
                ", tagdescription='" + tagdescription + '\'' +
                '}';
    }
}

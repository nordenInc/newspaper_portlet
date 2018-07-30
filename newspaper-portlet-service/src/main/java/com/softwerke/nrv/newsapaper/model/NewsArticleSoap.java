package com.softwerke.nrv.newsapaper.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsArticleSoap implements Serializable {
    private long _articleId;
    private String _author;
    private String _title;
    private String _content;
    private int _status;
    private Date _createDate;
    private String _editorComment;
    private Date _updateDate;
    private long _authorId;

    public NewsArticleSoap() {
    }

    public static NewsArticleSoap toSoapModel(NewsArticle model) {
        NewsArticleSoap soapModel = new NewsArticleSoap();

        soapModel.setArticleId(model.getArticleId());
        soapModel.setAuthor(model.getAuthor());
        soapModel.setTitle(model.getTitle());
        soapModel.setContent(model.getContent());
        soapModel.setStatus(model.getStatus());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setEditorComment(model.getEditorComment());
        soapModel.setUpdateDate(model.getUpdateDate());
        soapModel.setAuthorId(model.getAuthorId());

        return soapModel;
    }

    public static NewsArticleSoap[] toSoapModels(NewsArticle[] models) {
        NewsArticleSoap[] soapModels = new NewsArticleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NewsArticleSoap[][] toSoapModels(NewsArticle[][] models) {
        NewsArticleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NewsArticleSoap[models.length][models[0].length];
        } else {
            soapModels = new NewsArticleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NewsArticleSoap[] toSoapModels(List<NewsArticle> models) {
        List<NewsArticleSoap> soapModels = new ArrayList<NewsArticleSoap>(models.size());

        for (NewsArticle model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NewsArticleSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _articleId;
    }

    public void setPrimaryKey(long pk) {
        setArticleId(pk);
    }

    public long getArticleId() {
        return _articleId;
    }

    public void setArticleId(long articleId) {
        _articleId = articleId;
    }

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String author) {
        _author = author;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String content) {
        _content = content;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public String getEditorComment() {
        return _editorComment;
    }

    public void setEditorComment(String editorComment) {
        _editorComment = editorComment;
    }

    public Date getUpdateDate() {
        return _updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        _updateDate = updateDate;
    }

    public long getAuthorId() {
        return _authorId;
    }

    public void setAuthorId(long authorId) {
        _authorId = authorId;
    }
}

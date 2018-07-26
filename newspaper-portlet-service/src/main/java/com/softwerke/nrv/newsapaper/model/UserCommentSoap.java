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
public class UserCommentSoap implements Serializable {
    private long _commentId;
    private long _articleId;
    private String _author;
    private String _commentContent;
    private Date _createDate;
    private long _authorImageId;
    private String _commentTitle;

    public UserCommentSoap() {
    }

    public static UserCommentSoap toSoapModel(UserComment model) {
        UserCommentSoap soapModel = new UserCommentSoap();

        soapModel.setCommentId(model.getCommentId());
        soapModel.setArticleId(model.getArticleId());
        soapModel.setAuthor(model.getAuthor());
        soapModel.setCommentContent(model.getCommentContent());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setAuthorImageId(model.getAuthorImageId());
        soapModel.setCommentTitle(model.getCommentTitle());

        return soapModel;
    }

    public static UserCommentSoap[] toSoapModels(UserComment[] models) {
        UserCommentSoap[] soapModels = new UserCommentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserCommentSoap[][] toSoapModels(UserComment[][] models) {
        UserCommentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserCommentSoap[models.length][models[0].length];
        } else {
            soapModels = new UserCommentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserCommentSoap[] toSoapModels(List<UserComment> models) {
        List<UserCommentSoap> soapModels = new ArrayList<UserCommentSoap>(models.size());

        for (UserComment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserCommentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _commentId;
    }

    public void setPrimaryKey(long pk) {
        setCommentId(pk);
    }

    public long getCommentId() {
        return _commentId;
    }

    public void setCommentId(long commentId) {
        _commentId = commentId;
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

    public String getCommentContent() {
        return _commentContent;
    }

    public void setCommentContent(String commentContent) {
        _commentContent = commentContent;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public long getAuthorImageId() {
        return _authorImageId;
    }

    public void setAuthorImageId(long authorImageId) {
        _authorImageId = authorImageId;
    }

    public String getCommentTitle() {
        return _commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        _commentTitle = commentTitle;
    }
}

package com.softwerke.nrv.newsapaper.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NewsArticle}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticle
 * @generated
 */
public class NewsArticleWrapper implements NewsArticle,
    ModelWrapper<NewsArticle> {
    private NewsArticle _newsArticle;

    public NewsArticleWrapper(NewsArticle newsArticle) {
        _newsArticle = newsArticle;
    }

    @Override
    public Class<?> getModelClass() {
        return NewsArticle.class;
    }

    @Override
    public String getModelClassName() {
        return NewsArticle.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("articleId", getArticleId());
        attributes.put("author", getAuthor());
        attributes.put("title", getTitle());
        attributes.put("content", getContent());
        attributes.put("status", getStatus());
        attributes.put("createDate", getCreateDate());
        attributes.put("editorComment", getEditorComment());
        attributes.put("updateDate", getUpdateDate());
        attributes.put("authorId", getAuthorId());
        attributes.put("imageUrl", getImageUrl());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long articleId = (Long) attributes.get("articleId");

        if (articleId != null) {
            setArticleId(articleId);
        }

        String author = (String) attributes.get("author");

        if (author != null) {
            setAuthor(author);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String content = (String) attributes.get("content");

        if (content != null) {
            setContent(content);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        String editorComment = (String) attributes.get("editorComment");

        if (editorComment != null) {
            setEditorComment(editorComment);
        }

        Date updateDate = (Date) attributes.get("updateDate");

        if (updateDate != null) {
            setUpdateDate(updateDate);
        }

        Long authorId = (Long) attributes.get("authorId");

        if (authorId != null) {
            setAuthorId(authorId);
        }

        String imageUrl = (String) attributes.get("imageUrl");

        if (imageUrl != null) {
            setImageUrl(imageUrl);
        }
    }

    /**
    * Returns the primary key of this news article.
    *
    * @return the primary key of this news article
    */
    @Override
    public long getPrimaryKey() {
        return _newsArticle.getPrimaryKey();
    }

    /**
    * Sets the primary key of this news article.
    *
    * @param primaryKey the primary key of this news article
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _newsArticle.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the article ID of this news article.
    *
    * @return the article ID of this news article
    */
    @Override
    public long getArticleId() {
        return _newsArticle.getArticleId();
    }

    /**
    * Sets the article ID of this news article.
    *
    * @param articleId the article ID of this news article
    */
    @Override
    public void setArticleId(long articleId) {
        _newsArticle.setArticleId(articleId);
    }

    /**
    * Returns the author of this news article.
    *
    * @return the author of this news article
    */
    @Override
    public java.lang.String getAuthor() {
        return _newsArticle.getAuthor();
    }

    /**
    * Sets the author of this news article.
    *
    * @param author the author of this news article
    */
    @Override
    public void setAuthor(java.lang.String author) {
        _newsArticle.setAuthor(author);
    }

    /**
    * Returns the title of this news article.
    *
    * @return the title of this news article
    */
    @Override
    public java.lang.String getTitle() {
        return _newsArticle.getTitle();
    }

    /**
    * Sets the title of this news article.
    *
    * @param title the title of this news article
    */
    @Override
    public void setTitle(java.lang.String title) {
        _newsArticle.setTitle(title);
    }

    /**
    * Returns the content of this news article.
    *
    * @return the content of this news article
    */
    @Override
    public java.lang.String getContent() {
        return _newsArticle.getContent();
    }

    /**
    * Sets the content of this news article.
    *
    * @param content the content of this news article
    */
    @Override
    public void setContent(java.lang.String content) {
        _newsArticle.setContent(content);
    }

    /**
    * Returns the status of this news article.
    *
    * @return the status of this news article
    */
    @Override
    public int getStatus() {
        return _newsArticle.getStatus();
    }

    /**
    * Sets the status of this news article.
    *
    * @param status the status of this news article
    */
    @Override
    public void setStatus(int status) {
        _newsArticle.setStatus(status);
    }

    /**
    * Returns the create date of this news article.
    *
    * @return the create date of this news article
    */
    @Override
    public java.util.Date getCreateDate() {
        return _newsArticle.getCreateDate();
    }

    /**
    * Sets the create date of this news article.
    *
    * @param createDate the create date of this news article
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _newsArticle.setCreateDate(createDate);
    }

    /**
    * Returns the editor comment of this news article.
    *
    * @return the editor comment of this news article
    */
    @Override
    public java.lang.String getEditorComment() {
        return _newsArticle.getEditorComment();
    }

    /**
    * Sets the editor comment of this news article.
    *
    * @param editorComment the editor comment of this news article
    */
    @Override
    public void setEditorComment(java.lang.String editorComment) {
        _newsArticle.setEditorComment(editorComment);
    }

    /**
    * Returns the update date of this news article.
    *
    * @return the update date of this news article
    */
    @Override
    public java.util.Date getUpdateDate() {
        return _newsArticle.getUpdateDate();
    }

    /**
    * Sets the update date of this news article.
    *
    * @param updateDate the update date of this news article
    */
    @Override
    public void setUpdateDate(java.util.Date updateDate) {
        _newsArticle.setUpdateDate(updateDate);
    }

    /**
    * Returns the author ID of this news article.
    *
    * @return the author ID of this news article
    */
    @Override
    public long getAuthorId() {
        return _newsArticle.getAuthorId();
    }

    /**
    * Sets the author ID of this news article.
    *
    * @param authorId the author ID of this news article
    */
    @Override
    public void setAuthorId(long authorId) {
        _newsArticle.setAuthorId(authorId);
    }

    /**
    * Returns the image url of this news article.
    *
    * @return the image url of this news article
    */
    @Override
    public java.lang.String getImageUrl() {
        return _newsArticle.getImageUrl();
    }

    /**
    * Sets the image url of this news article.
    *
    * @param imageUrl the image url of this news article
    */
    @Override
    public void setImageUrl(java.lang.String imageUrl) {
        _newsArticle.setImageUrl(imageUrl);
    }

    @Override
    public boolean isNew() {
        return _newsArticle.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _newsArticle.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _newsArticle.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _newsArticle.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _newsArticle.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _newsArticle.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _newsArticle.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _newsArticle.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _newsArticle.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _newsArticle.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _newsArticle.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NewsArticleWrapper((NewsArticle) _newsArticle.clone());
    }

    @Override
    public int compareTo(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle) {
        return _newsArticle.compareTo(newsArticle);
    }

    @Override
    public int hashCode() {
        return _newsArticle.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.softwerke.nrv.newsapaper.model.NewsArticle> toCacheModel() {
        return _newsArticle.toCacheModel();
    }

    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle toEscapedModel() {
        return new NewsArticleWrapper(_newsArticle.toEscapedModel());
    }

    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle toUnescapedModel() {
        return new NewsArticleWrapper(_newsArticle.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _newsArticle.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _newsArticle.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _newsArticle.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NewsArticleWrapper)) {
            return false;
        }

        NewsArticleWrapper newsArticleWrapper = (NewsArticleWrapper) obj;

        if (Validator.equals(_newsArticle, newsArticleWrapper._newsArticle)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public NewsArticle getWrappedNewsArticle() {
        return _newsArticle;
    }

    @Override
    public NewsArticle getWrappedModel() {
        return _newsArticle;
    }

    @Override
    public void resetOriginalValues() {
        _newsArticle.resetOriginalValues();
    }
}

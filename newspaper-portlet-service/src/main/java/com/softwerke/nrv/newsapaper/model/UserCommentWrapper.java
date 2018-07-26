package com.softwerke.nrv.newsapaper.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserComment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserComment
 * @generated
 */
public class UserCommentWrapper implements UserComment,
    ModelWrapper<UserComment> {
    private UserComment _userComment;

    public UserCommentWrapper(UserComment userComment) {
        _userComment = userComment;
    }

    @Override
    public Class<?> getModelClass() {
        return UserComment.class;
    }

    @Override
    public String getModelClassName() {
        return UserComment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("commentId", getCommentId());
        attributes.put("articleId", getArticleId());
        attributes.put("author", getAuthor());
        attributes.put("commentContent", getCommentContent());
        attributes.put("createDate", getCreateDate());
        attributes.put("authorImageId", getAuthorImageId());
        attributes.put("commentTitle", getCommentTitle());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long commentId = (Long) attributes.get("commentId");

        if (commentId != null) {
            setCommentId(commentId);
        }

        Long articleId = (Long) attributes.get("articleId");

        if (articleId != null) {
            setArticleId(articleId);
        }

        String author = (String) attributes.get("author");

        if (author != null) {
            setAuthor(author);
        }

        String commentContent = (String) attributes.get("commentContent");

        if (commentContent != null) {
            setCommentContent(commentContent);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Long authorImageId = (Long) attributes.get("authorImageId");

        if (authorImageId != null) {
            setAuthorImageId(authorImageId);
        }

        String commentTitle = (String) attributes.get("commentTitle");

        if (commentTitle != null) {
            setCommentTitle(commentTitle);
        }
    }

    /**
    * Returns the primary key of this user comment.
    *
    * @return the primary key of this user comment
    */
    @Override
    public long getPrimaryKey() {
        return _userComment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user comment.
    *
    * @param primaryKey the primary key of this user comment
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _userComment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the comment ID of this user comment.
    *
    * @return the comment ID of this user comment
    */
    @Override
    public long getCommentId() {
        return _userComment.getCommentId();
    }

    /**
    * Sets the comment ID of this user comment.
    *
    * @param commentId the comment ID of this user comment
    */
    @Override
    public void setCommentId(long commentId) {
        _userComment.setCommentId(commentId);
    }

    /**
    * Returns the article ID of this user comment.
    *
    * @return the article ID of this user comment
    */
    @Override
    public long getArticleId() {
        return _userComment.getArticleId();
    }

    /**
    * Sets the article ID of this user comment.
    *
    * @param articleId the article ID of this user comment
    */
    @Override
    public void setArticleId(long articleId) {
        _userComment.setArticleId(articleId);
    }

    /**
    * Returns the author of this user comment.
    *
    * @return the author of this user comment
    */
    @Override
    public java.lang.String getAuthor() {
        return _userComment.getAuthor();
    }

    /**
    * Sets the author of this user comment.
    *
    * @param author the author of this user comment
    */
    @Override
    public void setAuthor(java.lang.String author) {
        _userComment.setAuthor(author);
    }

    /**
    * Returns the comment content of this user comment.
    *
    * @return the comment content of this user comment
    */
    @Override
    public java.lang.String getCommentContent() {
        return _userComment.getCommentContent();
    }

    /**
    * Sets the comment content of this user comment.
    *
    * @param commentContent the comment content of this user comment
    */
    @Override
    public void setCommentContent(java.lang.String commentContent) {
        _userComment.setCommentContent(commentContent);
    }

    /**
    * Returns the create date of this user comment.
    *
    * @return the create date of this user comment
    */
    @Override
    public java.util.Date getCreateDate() {
        return _userComment.getCreateDate();
    }

    /**
    * Sets the create date of this user comment.
    *
    * @param createDate the create date of this user comment
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _userComment.setCreateDate(createDate);
    }

    /**
    * Returns the author image ID of this user comment.
    *
    * @return the author image ID of this user comment
    */
    @Override
    public long getAuthorImageId() {
        return _userComment.getAuthorImageId();
    }

    /**
    * Sets the author image ID of this user comment.
    *
    * @param authorImageId the author image ID of this user comment
    */
    @Override
    public void setAuthorImageId(long authorImageId) {
        _userComment.setAuthorImageId(authorImageId);
    }

    /**
    * Returns the comment title of this user comment.
    *
    * @return the comment title of this user comment
    */
    @Override
    public java.lang.String getCommentTitle() {
        return _userComment.getCommentTitle();
    }

    /**
    * Sets the comment title of this user comment.
    *
    * @param commentTitle the comment title of this user comment
    */
    @Override
    public void setCommentTitle(java.lang.String commentTitle) {
        _userComment.setCommentTitle(commentTitle);
    }

    @Override
    public boolean isNew() {
        return _userComment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _userComment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _userComment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _userComment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _userComment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _userComment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userComment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userComment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _userComment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _userComment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userComment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserCommentWrapper((UserComment) _userComment.clone());
    }

    @Override
    public int compareTo(
        com.softwerke.nrv.newsapaper.model.UserComment userComment) {
        return _userComment.compareTo(userComment);
    }

    @Override
    public int hashCode() {
        return _userComment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.softwerke.nrv.newsapaper.model.UserComment> toCacheModel() {
        return _userComment.toCacheModel();
    }

    @Override
    public com.softwerke.nrv.newsapaper.model.UserComment toEscapedModel() {
        return new UserCommentWrapper(_userComment.toEscapedModel());
    }

    @Override
    public com.softwerke.nrv.newsapaper.model.UserComment toUnescapedModel() {
        return new UserCommentWrapper(_userComment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userComment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _userComment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userComment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserCommentWrapper)) {
            return false;
        }

        UserCommentWrapper userCommentWrapper = (UserCommentWrapper) obj;

        if (Validator.equals(_userComment, userCommentWrapper._userComment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UserComment getWrappedUserComment() {
        return _userComment;
    }

    @Override
    public UserComment getWrappedModel() {
        return _userComment;
    }

    @Override
    public void resetOriginalValues() {
        _userComment.resetOriginalValues();
    }
}

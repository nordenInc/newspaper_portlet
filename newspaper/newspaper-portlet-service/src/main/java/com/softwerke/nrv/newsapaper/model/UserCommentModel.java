package com.softwerke.nrv.newsapaper.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserComment service. Represents a row in the &quot;usercomment_data&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.softwerke.nrv.newsapaper.model.impl.UserCommentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.softwerke.nrv.newsapaper.model.impl.UserCommentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserComment
 * @see com.softwerke.nrv.newsapaper.model.impl.UserCommentImpl
 * @see com.softwerke.nrv.newsapaper.model.impl.UserCommentModelImpl
 * @generated
 */
public interface UserCommentModel extends BaseModel<UserComment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a user comment model instance should use the {@link UserComment} interface instead.
     */

    /**
     * Returns the primary key of this user comment.
     *
     * @return the primary key of this user comment
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this user comment.
     *
     * @param primaryKey the primary key of this user comment
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the comment ID of this user comment.
     *
     * @return the comment ID of this user comment
     */
    public long getCommentId();

    /**
     * Sets the comment ID of this user comment.
     *
     * @param commentId the comment ID of this user comment
     */
    public void setCommentId(long commentId);

    /**
     * Returns the article ID of this user comment.
     *
     * @return the article ID of this user comment
     */
    public long getArticleId();

    /**
     * Sets the article ID of this user comment.
     *
     * @param articleId the article ID of this user comment
     */
    public void setArticleId(long articleId);

    /**
     * Returns the author of this user comment.
     *
     * @return the author of this user comment
     */
    @AutoEscape
    public String getAuthor();

    /**
     * Sets the author of this user comment.
     *
     * @param author the author of this user comment
     */
    public void setAuthor(String author);

    /**
     * Returns the comment content of this user comment.
     *
     * @return the comment content of this user comment
     */
    @AutoEscape
    public String getCommentContent();

    /**
     * Sets the comment content of this user comment.
     *
     * @param commentContent the comment content of this user comment
     */
    public void setCommentContent(String commentContent);

    /**
     * Returns the create date of this user comment.
     *
     * @return the create date of this user comment
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this user comment.
     *
     * @param createDate the create date of this user comment
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the author image ID of this user comment.
     *
     * @return the author image ID of this user comment
     */
    public long getAuthorImageId();

    /**
     * Sets the author image ID of this user comment.
     *
     * @param authorImageId the author image ID of this user comment
     */
    public void setAuthorImageId(long authorImageId);

    /**
     * Returns the comment title of this user comment.
     *
     * @return the comment title of this user comment
     */
    @AutoEscape
    public String getCommentTitle();

    /**
     * Sets the comment title of this user comment.
     *
     * @param commentTitle the comment title of this user comment
     */
    public void setCommentTitle(String commentTitle);

    /**
     * Returns the image url of this user comment.
     *
     * @return the image url of this user comment
     */
    @AutoEscape
    public String getImageUrl();

    /**
     * Sets the image url of this user comment.
     *
     * @param imageUrl the image url of this user comment
     */
    public void setImageUrl(String imageUrl);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.softwerke.nrv.newsapaper.model.UserComment userComment);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.softwerke.nrv.newsapaper.model.UserComment> toCacheModel();

    @Override
    public com.softwerke.nrv.newsapaper.model.UserComment toEscapedModel();

    @Override
    public com.softwerke.nrv.newsapaper.model.UserComment toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
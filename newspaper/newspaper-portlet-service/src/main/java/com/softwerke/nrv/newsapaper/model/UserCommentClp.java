package com.softwerke.nrv.newsapaper.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.softwerke.nrv.newsapaper.service.ClpSerializer;
import com.softwerke.nrv.newsapaper.service.UserCommentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class UserCommentClp extends BaseModelImpl<UserComment>
    implements UserComment {
    private long _commentId;
    private long _articleId;
    private String _author;
    private String _commentContent;
    private Date _createDate;
    private long _authorImageId;
    private String _commentTitle;
    private String _imageUrl;
    private BaseModel<?> _userCommentRemoteModel;
    private Class<?> _clpSerializerClass = com.softwerke.nrv.newsapaper.service.ClpSerializer.class;

    public UserCommentClp() {
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
    public long getPrimaryKey() {
        return _commentId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCommentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _commentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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
        attributes.put("imageUrl", getImageUrl());

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

        String imageUrl = (String) attributes.get("imageUrl");

        if (imageUrl != null) {
            setImageUrl(imageUrl);
        }
    }

    @Override
    public long getCommentId() {
        return _commentId;
    }

    @Override
    public void setCommentId(long commentId) {
        _commentId = commentId;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setCommentId", long.class);

                method.invoke(_userCommentRemoteModel, commentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getArticleId() {
        return _articleId;
    }

    @Override
    public void setArticleId(long articleId) {
        _articleId = articleId;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setArticleId", long.class);

                method.invoke(_userCommentRemoteModel, articleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAuthor() {
        return _author;
    }

    @Override
    public void setAuthor(String author) {
        _author = author;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setAuthor", String.class);

                method.invoke(_userCommentRemoteModel, author);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCommentContent() {
        return _commentContent;
    }

    @Override
    public void setCommentContent(String commentContent) {
        _commentContent = commentContent;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setCommentContent",
                        String.class);

                method.invoke(_userCommentRemoteModel, commentContent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_userCommentRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAuthorImageId() {
        return _authorImageId;
    }

    @Override
    public void setAuthorImageId(long authorImageId) {
        _authorImageId = authorImageId;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setAuthorImageId", long.class);

                method.invoke(_userCommentRemoteModel, authorImageId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCommentTitle() {
        return _commentTitle;
    }

    @Override
    public void setCommentTitle(String commentTitle) {
        _commentTitle = commentTitle;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setCommentTitle", String.class);

                method.invoke(_userCommentRemoteModel, commentTitle);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getImageUrl() {
        return _imageUrl;
    }

    @Override
    public void setImageUrl(String imageUrl) {
        _imageUrl = imageUrl;

        if (_userCommentRemoteModel != null) {
            try {
                Class<?> clazz = _userCommentRemoteModel.getClass();

                Method method = clazz.getMethod("setImageUrl", String.class);

                method.invoke(_userCommentRemoteModel, imageUrl);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUserCommentRemoteModel() {
        return _userCommentRemoteModel;
    }

    public void setUserCommentRemoteModel(BaseModel<?> userCommentRemoteModel) {
        _userCommentRemoteModel = userCommentRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _userCommentRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_userCommentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserCommentLocalServiceUtil.addUserComment(this);
        } else {
            UserCommentLocalServiceUtil.updateUserComment(this);
        }
    }

    @Override
    public UserComment toEscapedModel() {
        return (UserComment) ProxyUtil.newProxyInstance(UserComment.class.getClassLoader(),
            new Class[] { UserComment.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UserCommentClp clone = new UserCommentClp();

        clone.setCommentId(getCommentId());
        clone.setArticleId(getArticleId());
        clone.setAuthor(getAuthor());
        clone.setCommentContent(getCommentContent());
        clone.setCreateDate(getCreateDate());
        clone.setAuthorImageId(getAuthorImageId());
        clone.setCommentTitle(getCommentTitle());
        clone.setImageUrl(getImageUrl());

        return clone;
    }

    @Override
    public int compareTo(UserComment userComment) {
        long primaryKey = userComment.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserCommentClp)) {
            return false;
        }

        UserCommentClp userComment = (UserCommentClp) obj;

        long primaryKey = userComment.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{commentId=");
        sb.append(getCommentId());
        sb.append(", articleId=");
        sb.append(getArticleId());
        sb.append(", author=");
        sb.append(getAuthor());
        sb.append(", commentContent=");
        sb.append(getCommentContent());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", authorImageId=");
        sb.append(getAuthorImageId());
        sb.append(", commentTitle=");
        sb.append(getCommentTitle());
        sb.append(", imageUrl=");
        sb.append(getImageUrl());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.softwerke.nrv.newsapaper.model.UserComment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>commentId</column-name><column-value><![CDATA[");
        sb.append(getCommentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>articleId</column-name><column-value><![CDATA[");
        sb.append(getArticleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>author</column-name><column-value><![CDATA[");
        sb.append(getAuthor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>commentContent</column-name><column-value><![CDATA[");
        sb.append(getCommentContent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>authorImageId</column-name><column-value><![CDATA[");
        sb.append(getAuthorImageId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>commentTitle</column-name><column-value><![CDATA[");
        sb.append(getCommentTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>imageUrl</column-name><column-value><![CDATA[");
        sb.append(getImageUrl());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

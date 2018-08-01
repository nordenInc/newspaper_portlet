package com.softwerke.nrv.newsapaper.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.softwerke.nrv.newsapaper.service.ClpSerializer;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class NewsArticleClp extends BaseModelImpl<NewsArticle>
    implements NewsArticle {
    private long _articleId;
    private String _author;
    private String _title;
    private String _content;
    private int _status;
    private Date _createDate;
    private String _editorComment;
    private Date _updateDate;
    private long _authorId;
    private String _imageUrl;
    private BaseModel<?> _newsArticleRemoteModel;
    private Class<?> _clpSerializerClass = com.softwerke.nrv.newsapaper.service.ClpSerializer.class;

    public NewsArticleClp() {
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
    public long getPrimaryKey() {
        return _articleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setArticleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _articleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getArticleId() {
        return _articleId;
    }

    @Override
    public void setArticleId(long articleId) {
        _articleId = articleId;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setArticleId", long.class);

                method.invoke(_newsArticleRemoteModel, articleId);
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

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setAuthor", String.class);

                method.invoke(_newsArticleRemoteModel, author);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_newsArticleRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContent() {
        return _content;
    }

    @Override
    public void setContent(String content) {
        _content = content;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setContent", String.class);

                method.invoke(_newsArticleRemoteModel, content);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_newsArticleRemoteModel, status);
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

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_newsArticleRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEditorComment() {
        return _editorComment;
    }

    @Override
    public void setEditorComment(String editorComment) {
        _editorComment = editorComment;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setEditorComment", String.class);

                method.invoke(_newsArticleRemoteModel, editorComment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getUpdateDate() {
        return _updateDate;
    }

    @Override
    public void setUpdateDate(Date updateDate) {
        _updateDate = updateDate;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdateDate", Date.class);

                method.invoke(_newsArticleRemoteModel, updateDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAuthorId() {
        return _authorId;
    }

    @Override
    public void setAuthorId(long authorId) {
        _authorId = authorId;

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setAuthorId", long.class);

                method.invoke(_newsArticleRemoteModel, authorId);
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

        if (_newsArticleRemoteModel != null) {
            try {
                Class<?> clazz = _newsArticleRemoteModel.getClass();

                Method method = clazz.getMethod("setImageUrl", String.class);

                method.invoke(_newsArticleRemoteModel, imageUrl);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getNewsArticleRemoteModel() {
        return _newsArticleRemoteModel;
    }

    public void setNewsArticleRemoteModel(BaseModel<?> newsArticleRemoteModel) {
        _newsArticleRemoteModel = newsArticleRemoteModel;
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

        Class<?> remoteModelClass = _newsArticleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_newsArticleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NewsArticleLocalServiceUtil.addNewsArticle(this);
        } else {
            NewsArticleLocalServiceUtil.updateNewsArticle(this);
        }
    }

    @Override
    public NewsArticle toEscapedModel() {
        return (NewsArticle) ProxyUtil.newProxyInstance(NewsArticle.class.getClassLoader(),
            new Class[] { NewsArticle.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NewsArticleClp clone = new NewsArticleClp();

        clone.setArticleId(getArticleId());
        clone.setAuthor(getAuthor());
        clone.setTitle(getTitle());
        clone.setContent(getContent());
        clone.setStatus(getStatus());
        clone.setCreateDate(getCreateDate());
        clone.setEditorComment(getEditorComment());
        clone.setUpdateDate(getUpdateDate());
        clone.setAuthorId(getAuthorId());
        clone.setImageUrl(getImageUrl());

        return clone;
    }

    @Override
    public int compareTo(NewsArticle newsArticle) {
        long primaryKey = newsArticle.getPrimaryKey();

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

        if (!(obj instanceof NewsArticleClp)) {
            return false;
        }

        NewsArticleClp newsArticle = (NewsArticleClp) obj;

        long primaryKey = newsArticle.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{articleId=");
        sb.append(getArticleId());
        sb.append(", author=");
        sb.append(getAuthor());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", content=");
        sb.append(getContent());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", editorComment=");
        sb.append(getEditorComment());
        sb.append(", updateDate=");
        sb.append(getUpdateDate());
        sb.append(", authorId=");
        sb.append(getAuthorId());
        sb.append(", imageUrl=");
        sb.append(getImageUrl());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.softwerke.nrv.newsapaper.model.NewsArticle");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>articleId</column-name><column-value><![CDATA[");
        sb.append(getArticleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>author</column-name><column-value><![CDATA[");
        sb.append(getAuthor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>content</column-name><column-value><![CDATA[");
        sb.append(getContent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>editorComment</column-name><column-value><![CDATA[");
        sb.append(getEditorComment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>updateDate</column-name><column-value><![CDATA[");
        sb.append(getUpdateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>authorId</column-name><column-value><![CDATA[");
        sb.append(getAuthorId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>imageUrl</column-name><column-value><![CDATA[");
        sb.append(getImageUrl());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

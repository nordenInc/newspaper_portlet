package com.softwerke.nrv.newsapaper.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.softwerke.nrv.newsapaper.model.NewsArticle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsArticle in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticle
 * @generated
 */
public class NewsArticleCacheModel implements CacheModel<NewsArticle>,
    Externalizable {
    public long articleId;
    public String author;
    public String title;
    public String content;
    public int status;
    public long createDate;
    public String editorComment;
    public long updateDate;
    public long authorId;
    public String imageUrl;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{articleId=");
        sb.append(articleId);
        sb.append(", author=");
        sb.append(author);
        sb.append(", title=");
        sb.append(title);
        sb.append(", content=");
        sb.append(content);
        sb.append(", status=");
        sb.append(status);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", editorComment=");
        sb.append(editorComment);
        sb.append(", updateDate=");
        sb.append(updateDate);
        sb.append(", authorId=");
        sb.append(authorId);
        sb.append(", imageUrl=");
        sb.append(imageUrl);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public NewsArticle toEntityModel() {
        NewsArticleImpl newsArticleImpl = new NewsArticleImpl();

        newsArticleImpl.setArticleId(articleId);

        if (author == null) {
            newsArticleImpl.setAuthor(StringPool.BLANK);
        } else {
            newsArticleImpl.setAuthor(author);
        }

        if (title == null) {
            newsArticleImpl.setTitle(StringPool.BLANK);
        } else {
            newsArticleImpl.setTitle(title);
        }

        if (content == null) {
            newsArticleImpl.setContent(StringPool.BLANK);
        } else {
            newsArticleImpl.setContent(content);
        }

        newsArticleImpl.setStatus(status);

        if (createDate == Long.MIN_VALUE) {
            newsArticleImpl.setCreateDate(null);
        } else {
            newsArticleImpl.setCreateDate(new Date(createDate));
        }

        if (editorComment == null) {
            newsArticleImpl.setEditorComment(StringPool.BLANK);
        } else {
            newsArticleImpl.setEditorComment(editorComment);
        }

        if (updateDate == Long.MIN_VALUE) {
            newsArticleImpl.setUpdateDate(null);
        } else {
            newsArticleImpl.setUpdateDate(new Date(updateDate));
        }

        newsArticleImpl.setAuthorId(authorId);

        if (imageUrl == null) {
            newsArticleImpl.setImageUrl(StringPool.BLANK);
        } else {
            newsArticleImpl.setImageUrl(imageUrl);
        }

        newsArticleImpl.resetOriginalValues();

        return newsArticleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        articleId = objectInput.readLong();
        author = objectInput.readUTF();
        title = objectInput.readUTF();
        content = objectInput.readUTF();
        status = objectInput.readInt();
        createDate = objectInput.readLong();
        editorComment = objectInput.readUTF();
        updateDate = objectInput.readLong();
        authorId = objectInput.readLong();
        imageUrl = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(articleId);

        if (author == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(author);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (content == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(content);
        }

        objectOutput.writeInt(status);
        objectOutput.writeLong(createDate);

        if (editorComment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(editorComment);
        }

        objectOutput.writeLong(updateDate);
        objectOutput.writeLong(authorId);

        if (imageUrl == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(imageUrl);
        }
    }
}

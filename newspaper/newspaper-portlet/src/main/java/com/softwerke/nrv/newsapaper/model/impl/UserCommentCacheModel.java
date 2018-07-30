package com.softwerke.nrv.newsapaper.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.softwerke.nrv.newsapaper.model.UserComment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserComment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserComment
 * @generated
 */
public class UserCommentCacheModel implements CacheModel<UserComment>,
    Externalizable {
    public long commentId;
    public long articleId;
    public String author;
    public String commentContent;
    public long createDate;
    public long authorImageId;
    public String commentTitle;
    public String imageUrl;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{commentId=");
        sb.append(commentId);
        sb.append(", articleId=");
        sb.append(articleId);
        sb.append(", author=");
        sb.append(author);
        sb.append(", commentContent=");
        sb.append(commentContent);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", authorImageId=");
        sb.append(authorImageId);
        sb.append(", commentTitle=");
        sb.append(commentTitle);
        sb.append(", imageUrl=");
        sb.append(imageUrl);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserComment toEntityModel() {
        UserCommentImpl userCommentImpl = new UserCommentImpl();

        userCommentImpl.setCommentId(commentId);
        userCommentImpl.setArticleId(articleId);

        if (author == null) {
            userCommentImpl.setAuthor(StringPool.BLANK);
        } else {
            userCommentImpl.setAuthor(author);
        }

        if (commentContent == null) {
            userCommentImpl.setCommentContent(StringPool.BLANK);
        } else {
            userCommentImpl.setCommentContent(commentContent);
        }

        if (createDate == Long.MIN_VALUE) {
            userCommentImpl.setCreateDate(null);
        } else {
            userCommentImpl.setCreateDate(new Date(createDate));
        }

        userCommentImpl.setAuthorImageId(authorImageId);

        if (commentTitle == null) {
            userCommentImpl.setCommentTitle(StringPool.BLANK);
        } else {
            userCommentImpl.setCommentTitle(commentTitle);
        }

        if (imageUrl == null) {
            userCommentImpl.setImageUrl(StringPool.BLANK);
        } else {
            userCommentImpl.setImageUrl(imageUrl);
        }

        userCommentImpl.resetOriginalValues();

        return userCommentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        commentId = objectInput.readLong();
        articleId = objectInput.readLong();
        author = objectInput.readUTF();
        commentContent = objectInput.readUTF();
        createDate = objectInput.readLong();
        authorImageId = objectInput.readLong();
        commentTitle = objectInput.readUTF();
        imageUrl = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(commentId);
        objectOutput.writeLong(articleId);

        if (author == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(author);
        }

        if (commentContent == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(commentContent);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(authorImageId);

        if (commentTitle == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(commentTitle);
        }

        if (imageUrl == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(imageUrl);
        }
    }
}

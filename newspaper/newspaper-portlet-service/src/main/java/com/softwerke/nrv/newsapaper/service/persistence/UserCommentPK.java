package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserCommentPK implements Comparable<UserCommentPK>, Serializable {
    public long commentId;
    public long articleId;

    public UserCommentPK() {
    }

    public UserCommentPK(long commentId, long articleId) {
        this.commentId = commentId;
        this.articleId = articleId;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    @Override
    public int compareTo(UserCommentPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (commentId < pk.commentId) {
            value = -1;
        } else if (commentId > pk.commentId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (articleId < pk.articleId) {
            value = -1;
        } else if (articleId > pk.articleId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserCommentPK)) {
            return false;
        }

        UserCommentPK pk = (UserCommentPK) obj;

        if ((commentId == pk.commentId) && (articleId == pk.articleId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(commentId) + String.valueOf(articleId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("commentId");
        sb.append(StringPool.EQUAL);
        sb.append(commentId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("articleId");
        sb.append(StringPool.EQUAL);
        sb.append(articleId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}

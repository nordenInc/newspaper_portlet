package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.softwerke.nrv.newsapaper.model.UserComment;
import com.softwerke.nrv.newsapaper.service.UserCommentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserCommentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserCommentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserCommentLocalServiceUtil.getService());
        setClass(UserComment.class);

        setClassLoader(com.softwerke.nrv.newsapaper.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("commentId");
    }
}

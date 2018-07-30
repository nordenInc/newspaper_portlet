package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.softwerke.nrv.newsapaper.model.NewsArticle;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class NewsArticleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NewsArticleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NewsArticleLocalServiceUtil.getService());
        setClass(NewsArticle.class);

        setClassLoader(com.softwerke.nrv.newsapaper.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("articleId");
    }
}

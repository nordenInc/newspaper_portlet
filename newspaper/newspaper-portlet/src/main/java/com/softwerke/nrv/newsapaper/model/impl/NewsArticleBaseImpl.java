package com.softwerke.nrv.newsapaper.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.softwerke.nrv.newsapaper.model.NewsArticle;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil;

/**
 * The extended model base implementation for the NewsArticle service. Represents a row in the &quot;newsartcile_data&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NewsArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticleImpl
 * @see com.softwerke.nrv.newsapaper.model.NewsArticle
 * @generated
 */
public abstract class NewsArticleBaseImpl extends NewsArticleModelImpl
    implements NewsArticle {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a news article model instance should use the {@link NewsArticle} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NewsArticleLocalServiceUtil.addNewsArticle(this);
        } else {
            NewsArticleLocalServiceUtil.updateNewsArticle(this);
        }
    }
}

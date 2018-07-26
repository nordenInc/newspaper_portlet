package com.softwerke.nrv.newsapaper.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsArticleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticleLocalService
 * @generated
 */
public class NewsArticleLocalServiceWrapper implements NewsArticleLocalService,
    ServiceWrapper<NewsArticleLocalService> {
    private NewsArticleLocalService _newsArticleLocalService;

    public NewsArticleLocalServiceWrapper(
        NewsArticleLocalService newsArticleLocalService) {
        _newsArticleLocalService = newsArticleLocalService;
    }

    /**
    * Adds the news article to the database. Also notifies the appropriate model listeners.
    *
    * @param newsArticle the news article
    * @return the news article that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle addNewsArticle(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.addNewsArticle(newsArticle);
    }

    /**
    * Creates a new news article with the primary key. Does not add the news article to the database.
    *
    * @param articleId the primary key for the new news article
    * @return the new news article
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle createNewsArticle(
        long articleId) {
        return _newsArticleLocalService.createNewsArticle(articleId);
    }

    /**
    * Deletes the news article with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the news article
    * @return the news article that was removed
    * @throws PortalException if a news article with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle deleteNewsArticle(
        long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.deleteNewsArticle(articleId);
    }

    /**
    * Deletes the news article from the database. Also notifies the appropriate model listeners.
    *
    * @param newsArticle the news article
    * @return the news article that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle deleteNewsArticle(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.deleteNewsArticle(newsArticle);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _newsArticleLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.NewsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.NewsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle fetchNewsArticle(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.fetchNewsArticle(articleId);
    }

    /**
    * Returns the news article with the primary key.
    *
    * @param articleId the primary key of the news article
    * @return the news article
    * @throws PortalException if a news article with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle getNewsArticle(
        long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.getNewsArticle(articleId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the news articles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.NewsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of news articles
    * @param end the upper bound of the range of news articles (not inclusive)
    * @return the range of news articles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.softwerke.nrv.newsapaper.model.NewsArticle> getNewsArticles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.getNewsArticles(start, end);
    }

    /**
    * Returns the number of news articles.
    *
    * @return the number of news articles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getNewsArticlesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.getNewsArticlesCount();
    }

    /**
    * Updates the news article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param newsArticle the news article
    * @return the news article that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.softwerke.nrv.newsapaper.model.NewsArticle updateNewsArticle(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _newsArticleLocalService.updateNewsArticle(newsArticle);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _newsArticleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _newsArticleLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _newsArticleLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NewsArticleLocalService getWrappedNewsArticleLocalService() {
        return _newsArticleLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNewsArticleLocalService(
        NewsArticleLocalService newsArticleLocalService) {
        _newsArticleLocalService = newsArticleLocalService;
    }

    @Override
    public NewsArticleLocalService getWrappedService() {
        return _newsArticleLocalService;
    }

    @Override
    public void setWrappedService(
        NewsArticleLocalService newsArticleLocalService) {
        _newsArticleLocalService = newsArticleLocalService;
    }
}

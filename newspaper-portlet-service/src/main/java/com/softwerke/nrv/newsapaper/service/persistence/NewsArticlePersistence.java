package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.softwerke.nrv.newsapaper.model.NewsArticle;

/**
 * The persistence interface for the news article service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticlePersistenceImpl
 * @see NewsArticleUtil
 * @generated
 */
public interface NewsArticlePersistence extends BasePersistence<NewsArticle> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link NewsArticleUtil} to access the news article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the news article in the entity cache if it is enabled.
    *
    * @param newsArticle the news article
    */
    public void cacheResult(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle);

    /**
    * Caches the news articles in the entity cache if it is enabled.
    *
    * @param newsArticles the news articles
    */
    public void cacheResult(
        java.util.List<com.softwerke.nrv.newsapaper.model.NewsArticle> newsArticles);

    /**
    * Creates a new news article with the primary key. Does not add the news article to the database.
    *
    * @param articleId the primary key for the new news article
    * @return the new news article
    */
    public com.softwerke.nrv.newsapaper.model.NewsArticle create(long articleId);

    /**
    * Removes the news article with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the news article
    * @return the news article that was removed
    * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.NewsArticle remove(long articleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchNewsArticleException;

    public com.softwerke.nrv.newsapaper.model.NewsArticle updateImpl(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the news article with the primary key or throws a {@link com.softwerke.nrv.newsapaper.NoSuchNewsArticleException} if it could not be found.
    *
    * @param articleId the primary key of the news article
    * @return the news article
    * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.NewsArticle findByPrimaryKey(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchNewsArticleException;

    /**
    * Returns the news article with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param articleId the primary key of the news article
    * @return the news article, or <code>null</code> if a news article with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.NewsArticle fetchByPrimaryKey(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the news articles.
    *
    * @return the news articles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.softwerke.nrv.newsapaper.model.NewsArticle> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.softwerke.nrv.newsapaper.model.NewsArticle> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the news articles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.NewsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of news articles
    * @param end the upper bound of the range of news articles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of news articles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.softwerke.nrv.newsapaper.model.NewsArticle> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the news articles from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of news articles.
    *
    * @return the number of news articles
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

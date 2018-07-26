package com.softwerke.nrv.newsapaper.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.softwerke.nrv.newsapaper.model.NewsArticle;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalService;
import com.softwerke.nrv.newsapaper.service.persistence.NewsArticlePersistence;
import com.softwerke.nrv.newsapaper.service.persistence.UserCommentPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the news article local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.softwerke.nrv.newsapaper.service.impl.NewsArticleLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.softwerke.nrv.newsapaper.service.impl.NewsArticleLocalServiceImpl
 * @see com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil
 * @generated
 */
public abstract class NewsArticleLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements NewsArticleLocalService,
        IdentifiableBean {
    @BeanReference(type = com.softwerke.nrv.newsapaper.service.NewsArticleLocalService.class)
    protected com.softwerke.nrv.newsapaper.service.NewsArticleLocalService newsArticleLocalService;
    @BeanReference(type = NewsArticlePersistence.class)
    protected NewsArticlePersistence newsArticlePersistence;
    @BeanReference(type = com.softwerke.nrv.newsapaper.service.UserCommentLocalService.class)
    protected com.softwerke.nrv.newsapaper.service.UserCommentLocalService userCommentLocalService;
    @BeanReference(type = UserCommentPersistence.class)
    protected UserCommentPersistence userCommentPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private NewsArticleLocalServiceClpInvoker _clpInvoker = new NewsArticleLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil} to access the news article local service.
     */

    /**
     * Adds the news article to the database. Also notifies the appropriate model listeners.
     *
     * @param newsArticle the news article
     * @return the news article that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public NewsArticle addNewsArticle(NewsArticle newsArticle)
        throws SystemException {
        newsArticle.setNew(true);

        return newsArticlePersistence.update(newsArticle);
    }

    /**
     * Creates a new news article with the primary key. Does not add the news article to the database.
     *
     * @param articleId the primary key for the new news article
     * @return the new news article
     */
    @Override
    public NewsArticle createNewsArticle(long articleId) {
        return newsArticlePersistence.create(articleId);
    }

    /**
     * Deletes the news article with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param articleId the primary key of the news article
     * @return the news article that was removed
     * @throws PortalException if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public NewsArticle deleteNewsArticle(long articleId)
        throws PortalException, SystemException {
        return newsArticlePersistence.remove(articleId);
    }

    /**
     * Deletes the news article from the database. Also notifies the appropriate model listeners.
     *
     * @param newsArticle the news article
     * @return the news article that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public NewsArticle deleteNewsArticle(NewsArticle newsArticle)
        throws SystemException {
        return newsArticlePersistence.remove(newsArticle);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(NewsArticle.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return newsArticlePersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return newsArticlePersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return newsArticlePersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return newsArticlePersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return newsArticlePersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public NewsArticle fetchNewsArticle(long articleId)
        throws SystemException {
        return newsArticlePersistence.fetchByPrimaryKey(articleId);
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
    public NewsArticle getNewsArticle(long articleId)
        throws PortalException, SystemException {
        return newsArticlePersistence.findByPrimaryKey(articleId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return newsArticlePersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<NewsArticle> getNewsArticles(int start, int end)
        throws SystemException {
        return newsArticlePersistence.findAll(start, end);
    }

    /**
     * Returns the number of news articles.
     *
     * @return the number of news articles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getNewsArticlesCount() throws SystemException {
        return newsArticlePersistence.countAll();
    }

    /**
     * Updates the news article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param newsArticle the news article
     * @return the news article that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public NewsArticle updateNewsArticle(NewsArticle newsArticle)
        throws SystemException {
        return newsArticlePersistence.update(newsArticle);
    }

    /**
     * Returns the news article local service.
     *
     * @return the news article local service
     */
    public com.softwerke.nrv.newsapaper.service.NewsArticleLocalService getNewsArticleLocalService() {
        return newsArticleLocalService;
    }

    /**
     * Sets the news article local service.
     *
     * @param newsArticleLocalService the news article local service
     */
    public void setNewsArticleLocalService(
        com.softwerke.nrv.newsapaper.service.NewsArticleLocalService newsArticleLocalService) {
        this.newsArticleLocalService = newsArticleLocalService;
    }

    /**
     * Returns the news article persistence.
     *
     * @return the news article persistence
     */
    public NewsArticlePersistence getNewsArticlePersistence() {
        return newsArticlePersistence;
    }

    /**
     * Sets the news article persistence.
     *
     * @param newsArticlePersistence the news article persistence
     */
    public void setNewsArticlePersistence(
        NewsArticlePersistence newsArticlePersistence) {
        this.newsArticlePersistence = newsArticlePersistence;
    }

    /**
     * Returns the user comment local service.
     *
     * @return the user comment local service
     */
    public com.softwerke.nrv.newsapaper.service.UserCommentLocalService getUserCommentLocalService() {
        return userCommentLocalService;
    }

    /**
     * Sets the user comment local service.
     *
     * @param userCommentLocalService the user comment local service
     */
    public void setUserCommentLocalService(
        com.softwerke.nrv.newsapaper.service.UserCommentLocalService userCommentLocalService) {
        this.userCommentLocalService = userCommentLocalService;
    }

    /**
     * Returns the user comment persistence.
     *
     * @return the user comment persistence
     */
    public UserCommentPersistence getUserCommentPersistence() {
        return userCommentPersistence;
    }

    /**
     * Sets the user comment persistence.
     *
     * @param userCommentPersistence the user comment persistence
     */
    public void setUserCommentPersistence(
        UserCommentPersistence userCommentPersistence) {
        this.userCommentPersistence = userCommentPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.softwerke.nrv.newsapaper.model.NewsArticle",
            newsArticleLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.softwerke.nrv.newsapaper.model.NewsArticle");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return NewsArticle.class;
    }

    protected String getModelClassName() {
        return NewsArticle.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = newsArticlePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

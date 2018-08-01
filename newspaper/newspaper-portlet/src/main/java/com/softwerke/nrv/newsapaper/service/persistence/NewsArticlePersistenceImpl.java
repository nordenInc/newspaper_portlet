package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.softwerke.nrv.newsapaper.NoSuchNewsArticleException;
import com.softwerke.nrv.newsapaper.model.NewsArticle;
import com.softwerke.nrv.newsapaper.model.impl.NewsArticleImpl;
import com.softwerke.nrv.newsapaper.model.impl.NewsArticleModelImpl;
import com.softwerke.nrv.newsapaper.service.persistence.NewsArticlePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the news article service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsArticlePersistence
 * @see NewsArticleUtil
 * @generated
 */
public class NewsArticlePersistenceImpl extends BasePersistenceImpl<NewsArticle>
    implements NewsArticlePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NewsArticleUtil} to access the news article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NewsArticleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleModelImpl.FINDER_CACHE_ENABLED, NewsArticleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleModelImpl.FINDER_CACHE_ENABLED, NewsArticleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_NEWSARTICLE = "SELECT newsArticle FROM NewsArticle newsArticle";
    private static final String _SQL_COUNT_NEWSARTICLE = "SELECT COUNT(newsArticle) FROM NewsArticle newsArticle";
    private static final String _ORDER_BY_ENTITY_ALIAS = "newsArticle.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NewsArticle exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NewsArticlePersistenceImpl.class);
    private static NewsArticle _nullNewsArticle = new NewsArticleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<NewsArticle> toCacheModel() {
                return _nullNewsArticleCacheModel;
            }
        };

    private static CacheModel<NewsArticle> _nullNewsArticleCacheModel = new CacheModel<NewsArticle>() {
            @Override
            public NewsArticle toEntityModel() {
                return _nullNewsArticle;
            }
        };

    public NewsArticlePersistenceImpl() {
        setModelClass(NewsArticle.class);
    }

    /**
     * Caches the news article in the entity cache if it is enabled.
     *
     * @param newsArticle the news article
     */
    @Override
    public void cacheResult(NewsArticle newsArticle) {
        EntityCacheUtil.putResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleImpl.class, newsArticle.getPrimaryKey(), newsArticle);

        newsArticle.resetOriginalValues();
    }

    /**
     * Caches the news articles in the entity cache if it is enabled.
     *
     * @param newsArticles the news articles
     */
    @Override
    public void cacheResult(List<NewsArticle> newsArticles) {
        for (NewsArticle newsArticle : newsArticles) {
            if (EntityCacheUtil.getResult(
                        NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
                        NewsArticleImpl.class, newsArticle.getPrimaryKey()) == null) {
                cacheResult(newsArticle);
            } else {
                newsArticle.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all news articles.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NewsArticleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NewsArticleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the news article.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(NewsArticle newsArticle) {
        EntityCacheUtil.removeResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleImpl.class, newsArticle.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<NewsArticle> newsArticles) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (NewsArticle newsArticle : newsArticles) {
            EntityCacheUtil.removeResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
                NewsArticleImpl.class, newsArticle.getPrimaryKey());
        }
    }

    /**
     * Creates a new news article with the primary key. Does not add the news article to the database.
     *
     * @param articleId the primary key for the new news article
     * @return the new news article
     */
    @Override
    public NewsArticle create(long articleId) {
        NewsArticle newsArticle = new NewsArticleImpl();

        newsArticle.setNew(true);
        newsArticle.setPrimaryKey(articleId);

        return newsArticle;
    }

    /**
     * Removes the news article with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param articleId the primary key of the news article
     * @return the news article that was removed
     * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle remove(long articleId)
        throws NoSuchNewsArticleException, SystemException {
        return remove((Serializable) articleId);
    }

    /**
     * Removes the news article with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the news article
     * @return the news article that was removed
     * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle remove(Serializable primaryKey)
        throws NoSuchNewsArticleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            NewsArticle newsArticle = (NewsArticle) session.get(NewsArticleImpl.class,
                    primaryKey);

            if (newsArticle == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNewsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(newsArticle);
        } catch (NoSuchNewsArticleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected NewsArticle removeImpl(NewsArticle newsArticle)
        throws SystemException {
        newsArticle = toUnwrappedModel(newsArticle);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(newsArticle)) {
                newsArticle = (NewsArticle) session.get(NewsArticleImpl.class,
                        newsArticle.getPrimaryKeyObj());
            }

            if (newsArticle != null) {
                session.delete(newsArticle);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (newsArticle != null) {
            clearCache(newsArticle);
        }

        return newsArticle;
    }

    @Override
    public NewsArticle updateImpl(
        com.softwerke.nrv.newsapaper.model.NewsArticle newsArticle)
        throws SystemException {
        newsArticle = toUnwrappedModel(newsArticle);

        boolean isNew = newsArticle.isNew();

        Session session = null;

        try {
            session = openSession();

            if (newsArticle.isNew()) {
                session.save(newsArticle);

                newsArticle.setNew(false);
            } else {
                session.merge(newsArticle);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
            NewsArticleImpl.class, newsArticle.getPrimaryKey(), newsArticle);

        return newsArticle;
    }

    protected NewsArticle toUnwrappedModel(NewsArticle newsArticle) {
        if (newsArticle instanceof NewsArticleImpl) {
            return newsArticle;
        }

        NewsArticleImpl newsArticleImpl = new NewsArticleImpl();

        newsArticleImpl.setNew(newsArticle.isNew());
        newsArticleImpl.setPrimaryKey(newsArticle.getPrimaryKey());

        newsArticleImpl.setArticleId(newsArticle.getArticleId());
        newsArticleImpl.setAuthor(newsArticle.getAuthor());
        newsArticleImpl.setTitle(newsArticle.getTitle());
        newsArticleImpl.setContent(newsArticle.getContent());
        newsArticleImpl.setStatus(newsArticle.getStatus());
        newsArticleImpl.setCreateDate(newsArticle.getCreateDate());
        newsArticleImpl.setEditorComment(newsArticle.getEditorComment());
        newsArticleImpl.setUpdateDate(newsArticle.getUpdateDate());
        newsArticleImpl.setAuthorId(newsArticle.getAuthorId());
        newsArticleImpl.setImageUrl(newsArticle.getImageUrl());

        return newsArticleImpl;
    }

    /**
     * Returns the news article with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the news article
     * @return the news article
     * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNewsArticleException, SystemException {
        NewsArticle newsArticle = fetchByPrimaryKey(primaryKey);

        if (newsArticle == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNewsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return newsArticle;
    }

    /**
     * Returns the news article with the primary key or throws a {@link com.softwerke.nrv.newsapaper.NoSuchNewsArticleException} if it could not be found.
     *
     * @param articleId the primary key of the news article
     * @return the news article
     * @throws com.softwerke.nrv.newsapaper.NoSuchNewsArticleException if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle findByPrimaryKey(long articleId)
        throws NoSuchNewsArticleException, SystemException {
        return findByPrimaryKey((Serializable) articleId);
    }

    /**
     * Returns the news article with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the news article
     * @return the news article, or <code>null</code> if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        NewsArticle newsArticle = (NewsArticle) EntityCacheUtil.getResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
                NewsArticleImpl.class, primaryKey);

        if (newsArticle == _nullNewsArticle) {
            return null;
        }

        if (newsArticle == null) {
            Session session = null;

            try {
                session = openSession();

                newsArticle = (NewsArticle) session.get(NewsArticleImpl.class,
                        primaryKey);

                if (newsArticle != null) {
                    cacheResult(newsArticle);
                } else {
                    EntityCacheUtil.putResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
                        NewsArticleImpl.class, primaryKey, _nullNewsArticle);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NewsArticleModelImpl.ENTITY_CACHE_ENABLED,
                    NewsArticleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return newsArticle;
    }

    /**
     * Returns the news article with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param articleId the primary key of the news article
     * @return the news article, or <code>null</code> if a news article with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NewsArticle fetchByPrimaryKey(long articleId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) articleId);
    }

    /**
     * Returns all the news articles.
     *
     * @return the news articles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NewsArticle> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<NewsArticle> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<NewsArticle> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<NewsArticle> list = (List<NewsArticle>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NEWSARTICLE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NEWSARTICLE;

                if (pagination) {
                    sql = sql.concat(NewsArticleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<NewsArticle>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NewsArticle>(list);
                } else {
                    list = (List<NewsArticle>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the news articles from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (NewsArticle newsArticle : findAll()) {
            remove(newsArticle);
        }
    }

    /**
     * Returns the number of news articles.
     *
     * @return the number of news articles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_NEWSARTICLE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the news article persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.softwerke.nrv.newsapaper.model.NewsArticle")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<NewsArticle>> listenersList = new ArrayList<ModelListener<NewsArticle>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<NewsArticle>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NewsArticleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

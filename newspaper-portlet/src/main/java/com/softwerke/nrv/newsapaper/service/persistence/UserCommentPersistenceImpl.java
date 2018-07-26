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

import com.softwerke.nrv.newsapaper.NoSuchUserCommentException;
import com.softwerke.nrv.newsapaper.model.UserComment;
import com.softwerke.nrv.newsapaper.model.impl.UserCommentImpl;
import com.softwerke.nrv.newsapaper.model.impl.UserCommentModelImpl;
import com.softwerke.nrv.newsapaper.service.persistence.UserCommentPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user comment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCommentPersistence
 * @see UserCommentUtil
 * @generated
 */
public class UserCommentPersistenceImpl extends BasePersistenceImpl<UserComment>
    implements UserCommentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UserCommentUtil} to access the user comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UserCommentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentModelImpl.FINDER_CACHE_ENABLED, UserCommentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentModelImpl.FINDER_CACHE_ENABLED, UserCommentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_USERCOMMENT = "SELECT userComment FROM UserComment userComment";
    private static final String _SQL_COUNT_USERCOMMENT = "SELECT COUNT(userComment) FROM UserComment userComment";
    private static final String _ORDER_BY_ENTITY_ALIAS = "userComment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserComment exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UserCommentPersistenceImpl.class);
    private static UserComment _nullUserComment = new UserCommentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UserComment> toCacheModel() {
                return _nullUserCommentCacheModel;
            }
        };

    private static CacheModel<UserComment> _nullUserCommentCacheModel = new CacheModel<UserComment>() {
            @Override
            public UserComment toEntityModel() {
                return _nullUserComment;
            }
        };

    public UserCommentPersistenceImpl() {
        setModelClass(UserComment.class);
    }

    /**
     * Caches the user comment in the entity cache if it is enabled.
     *
     * @param userComment the user comment
     */
    @Override
    public void cacheResult(UserComment userComment) {
        EntityCacheUtil.putResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentImpl.class, userComment.getPrimaryKey(), userComment);

        userComment.resetOriginalValues();
    }

    /**
     * Caches the user comments in the entity cache if it is enabled.
     *
     * @param userComments the user comments
     */
    @Override
    public void cacheResult(List<UserComment> userComments) {
        for (UserComment userComment : userComments) {
            if (EntityCacheUtil.getResult(
                        UserCommentModelImpl.ENTITY_CACHE_ENABLED,
                        UserCommentImpl.class, userComment.getPrimaryKey()) == null) {
                cacheResult(userComment);
            } else {
                userComment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all user comments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UserCommentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UserCommentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the user comment.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UserComment userComment) {
        EntityCacheUtil.removeResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentImpl.class, userComment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UserComment> userComments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UserComment userComment : userComments) {
            EntityCacheUtil.removeResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
                UserCommentImpl.class, userComment.getPrimaryKey());
        }
    }

    /**
     * Creates a new user comment with the primary key. Does not add the user comment to the database.
     *
     * @param commentId the primary key for the new user comment
     * @return the new user comment
     */
    @Override
    public UserComment create(long commentId) {
        UserComment userComment = new UserCommentImpl();

        userComment.setNew(true);
        userComment.setPrimaryKey(commentId);

        return userComment;
    }

    /**
     * Removes the user comment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param commentId the primary key of the user comment
     * @return the user comment that was removed
     * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment remove(long commentId)
        throws NoSuchUserCommentException, SystemException {
        return remove((Serializable) commentId);
    }

    /**
     * Removes the user comment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the user comment
     * @return the user comment that was removed
     * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment remove(Serializable primaryKey)
        throws NoSuchUserCommentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UserComment userComment = (UserComment) session.get(UserCommentImpl.class,
                    primaryKey);

            if (userComment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUserCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(userComment);
        } catch (NoSuchUserCommentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UserComment removeImpl(UserComment userComment)
        throws SystemException {
        userComment = toUnwrappedModel(userComment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(userComment)) {
                userComment = (UserComment) session.get(UserCommentImpl.class,
                        userComment.getPrimaryKeyObj());
            }

            if (userComment != null) {
                session.delete(userComment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (userComment != null) {
            clearCache(userComment);
        }

        return userComment;
    }

    @Override
    public UserComment updateImpl(
        com.softwerke.nrv.newsapaper.model.UserComment userComment)
        throws SystemException {
        userComment = toUnwrappedModel(userComment);

        boolean isNew = userComment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (userComment.isNew()) {
                session.save(userComment);

                userComment.setNew(false);
            } else {
                session.merge(userComment);
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

        EntityCacheUtil.putResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
            UserCommentImpl.class, userComment.getPrimaryKey(), userComment);

        return userComment;
    }

    protected UserComment toUnwrappedModel(UserComment userComment) {
        if (userComment instanceof UserCommentImpl) {
            return userComment;
        }

        UserCommentImpl userCommentImpl = new UserCommentImpl();

        userCommentImpl.setNew(userComment.isNew());
        userCommentImpl.setPrimaryKey(userComment.getPrimaryKey());

        userCommentImpl.setCommentId(userComment.getCommentId());
        userCommentImpl.setArticleId(userComment.getArticleId());
        userCommentImpl.setAuthor(userComment.getAuthor());
        userCommentImpl.setCommentContent(userComment.getCommentContent());
        userCommentImpl.setCreateDate(userComment.getCreateDate());
        userCommentImpl.setAuthorImageId(userComment.getAuthorImageId());
        userCommentImpl.setCommentTitle(userComment.getCommentTitle());

        return userCommentImpl;
    }

    /**
     * Returns the user comment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the user comment
     * @return the user comment
     * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUserCommentException, SystemException {
        UserComment userComment = fetchByPrimaryKey(primaryKey);

        if (userComment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUserCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return userComment;
    }

    /**
     * Returns the user comment with the primary key or throws a {@link com.softwerke.nrv.newsapaper.NoSuchUserCommentException} if it could not be found.
     *
     * @param commentId the primary key of the user comment
     * @return the user comment
     * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment findByPrimaryKey(long commentId)
        throws NoSuchUserCommentException, SystemException {
        return findByPrimaryKey((Serializable) commentId);
    }

    /**
     * Returns the user comment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the user comment
     * @return the user comment, or <code>null</code> if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UserComment userComment = (UserComment) EntityCacheUtil.getResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
                UserCommentImpl.class, primaryKey);

        if (userComment == _nullUserComment) {
            return null;
        }

        if (userComment == null) {
            Session session = null;

            try {
                session = openSession();

                userComment = (UserComment) session.get(UserCommentImpl.class,
                        primaryKey);

                if (userComment != null) {
                    cacheResult(userComment);
                } else {
                    EntityCacheUtil.putResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
                        UserCommentImpl.class, primaryKey, _nullUserComment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UserCommentModelImpl.ENTITY_CACHE_ENABLED,
                    UserCommentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return userComment;
    }

    /**
     * Returns the user comment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param commentId the primary key of the user comment
     * @return the user comment, or <code>null</code> if a user comment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserComment fetchByPrimaryKey(long commentId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) commentId);
    }

    /**
     * Returns all the user comments.
     *
     * @return the user comments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserComment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user comments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.UserCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user comments
     * @param end the upper bound of the range of user comments (not inclusive)
     * @return the range of user comments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserComment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the user comments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.nrv.newsapaper.model.impl.UserCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user comments
     * @param end the upper bound of the range of user comments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of user comments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserComment> findAll(int start, int end,
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

        List<UserComment> list = (List<UserComment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERCOMMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERCOMMENT;

                if (pagination) {
                    sql = sql.concat(UserCommentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UserComment>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserComment>(list);
                } else {
                    list = (List<UserComment>) QueryUtil.list(q, getDialect(),
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
     * Removes all the user comments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UserComment userComment : findAll()) {
            remove(userComment);
        }
    }

    /**
     * Returns the number of user comments.
     *
     * @return the number of user comments
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

                Query q = session.createQuery(_SQL_COUNT_USERCOMMENT);

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
     * Initializes the user comment persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.softwerke.nrv.newsapaper.model.UserComment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UserComment>> listenersList = new ArrayList<ModelListener<UserComment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UserComment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UserCommentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.softwerke.nrv.newsapaper.model.UserComment;

import java.util.List;

/**
 * The persistence utility for the user comment service. This utility wraps {@link UserCommentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCommentPersistence
 * @see UserCommentPersistenceImpl
 * @generated
 */
public class UserCommentUtil {
    private static UserCommentPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(UserComment userComment) {
        getPersistence().clearCache(userComment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<UserComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserComment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserComment update(UserComment userComment)
        throws SystemException {
        return getPersistence().update(userComment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserComment update(UserComment userComment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(userComment, serviceContext);
    }

    /**
    * Caches the user comment in the entity cache if it is enabled.
    *
    * @param userComment the user comment
    */
    public static void cacheResult(
        com.softwerke.nrv.newsapaper.model.UserComment userComment) {
        getPersistence().cacheResult(userComment);
    }

    /**
    * Caches the user comments in the entity cache if it is enabled.
    *
    * @param userComments the user comments
    */
    public static void cacheResult(
        java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> userComments) {
        getPersistence().cacheResult(userComments);
    }

    /**
    * Creates a new user comment with the primary key. Does not add the user comment to the database.
    *
    * @param commentId the primary key for the new user comment
    * @return the new user comment
    */
    public static com.softwerke.nrv.newsapaper.model.UserComment create(
        long commentId) {
        return getPersistence().create(commentId);
    }

    /**
    * Removes the user comment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment that was removed
    * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.softwerke.nrv.newsapaper.model.UserComment remove(
        long commentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchUserCommentException {
        return getPersistence().remove(commentId);
    }

    public static com.softwerke.nrv.newsapaper.model.UserComment updateImpl(
        com.softwerke.nrv.newsapaper.model.UserComment userComment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userComment);
    }

    /**
    * Returns the user comment with the primary key or throws a {@link com.softwerke.nrv.newsapaper.NoSuchUserCommentException} if it could not be found.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment
    * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.softwerke.nrv.newsapaper.model.UserComment findByPrimaryKey(
        long commentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchUserCommentException {
        return getPersistence().findByPrimaryKey(commentId);
    }

    /**
    * Returns the user comment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment, or <code>null</code> if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.softwerke.nrv.newsapaper.model.UserComment fetchByPrimaryKey(
        long commentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(commentId);
    }

    /**
    * Returns all the user comments.
    *
    * @return the user comments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user comments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user comments.
    *
    * @return the number of user comments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserCommentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserCommentPersistence) PortletBeanLocatorUtil.locate(com.softwerke.nrv.newsapaper.service.ClpSerializer.getServletContextName(),
                    UserCommentPersistence.class.getName());

            ReferenceRegistry.registerReference(UserCommentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserCommentPersistence persistence) {
    }
}

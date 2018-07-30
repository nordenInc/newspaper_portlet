package com.softwerke.nrv.newsapaper.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.softwerke.nrv.newsapaper.model.UserComment;

/**
 * The persistence interface for the user comment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCommentPersistenceImpl
 * @see UserCommentUtil
 * @generated
 */
public interface UserCommentPersistence extends BasePersistence<UserComment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserCommentUtil} to access the user comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the user comment in the entity cache if it is enabled.
    *
    * @param userComment the user comment
    */
    public void cacheResult(
        com.softwerke.nrv.newsapaper.model.UserComment userComment);

    /**
    * Caches the user comments in the entity cache if it is enabled.
    *
    * @param userComments the user comments
    */
    public void cacheResult(
        java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> userComments);

    /**
    * Creates a new user comment with the primary key. Does not add the user comment to the database.
    *
    * @param commentId the primary key for the new user comment
    * @return the new user comment
    */
    public com.softwerke.nrv.newsapaper.model.UserComment create(long commentId);

    /**
    * Removes the user comment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment that was removed
    * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.UserComment remove(long commentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchUserCommentException;

    public com.softwerke.nrv.newsapaper.model.UserComment updateImpl(
        com.softwerke.nrv.newsapaper.model.UserComment userComment)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user comment with the primary key or throws a {@link com.softwerke.nrv.newsapaper.NoSuchUserCommentException} if it could not be found.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment
    * @throws com.softwerke.nrv.newsapaper.NoSuchUserCommentException if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.UserComment findByPrimaryKey(
        long commentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.softwerke.nrv.newsapaper.NoSuchUserCommentException;

    /**
    * Returns the user comment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param commentId the primary key of the user comment
    * @return the user comment, or <code>null</code> if a user comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.softwerke.nrv.newsapaper.model.UserComment fetchByPrimaryKey(
        long commentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user comments.
    *
    * @return the user comments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.softwerke.nrv.newsapaper.model.UserComment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user comments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user comments.
    *
    * @return the number of user comments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

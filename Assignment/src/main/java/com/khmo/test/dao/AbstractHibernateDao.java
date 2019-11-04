package com.khmo.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractHibernateDao<T> implements DaoBase<T>{

	@Autowired
	SessionFactory sessionFactory;

	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public T update(final T entity) {
		getCurrentSession().update(entity);
		return entity;
	}
	@Override
	public T save(final T entity) {
		getCurrentSession().save(entity);
		return entity;
	}
	@Override
	public T saveOrUpdate(final T entity) {
		getCurrentSession().saveOrUpdate(entity);
		return entity;

	}
	@Override
	public T persist(final T entity) {
		getCurrentSession().persist(entity);
		return entity;
	}

	@Override
	public void delete(final T entity) {
		getCurrentSession().delete(entity);
	}
	@Override
	public T merge(final T entity) {
		return (T) getCurrentSession().merge(entity);
	}

	/**
	 * delete all entries of a table .
	 * 
	 * @return number of deltes rows.
	 */

	/*
	 * public int deleteAll() { String hqlDelete = "delete " +
	 * entityClass.getName(); return
	 * getCurrentSession().createQuery(hqlDelete).executeUpdate(); }
	 */
	/** {@inheritDoc} */
	@Override
	public void refresh(final T entity) {
		this.getCurrentSession().refresh(entity);
	}

	/*
	 * 
	 * public void replicate(final T entity) {
	 * this.getCurrentSession().replicate(entity, ReplicationMode.OVERWRITE);
	 * 
	 * }
	 */
	@Override
	public List<T> findAll(final Class<T> type) {
		return getCurrentSession().createCriteria(type).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@Override
	public boolean removeById(final Class<?> type, final int id) {
		if (id > 0) {
			Object entity = getCurrentSession().get(type, id);
			if (entity != null) {
				getCurrentSession().delete(entity);
				return true;
			}
		}
		return false;
	}

	/*
	 * 
	 * public void removeByIds(final Class<?> type, final PK[] ids) { final Criteria
	 * c = getCurrentSession().createCriteria(type); c.add(Restrictions.in("id",
	 * ids)); for (Object entity : c.list()) { getCurrentSession().delete(entity); }
	 * }
	 */
}

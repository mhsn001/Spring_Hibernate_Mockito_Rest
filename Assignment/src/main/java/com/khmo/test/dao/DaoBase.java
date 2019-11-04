package com.khmo.test.dao;

import java.util.List;


public interface DaoBase<T> {


	public T update(final T entity);

	public T save(final T entity);

	public T saveOrUpdate(final T entity);

	public T persist(final T entity);


	public void delete(final T entity);

	public T merge(final T entity);


	public void refresh(final T entity);


	public List<T> findAll(final Class<T> type);

	
	public boolean removeById(final Class<?> type, final int id);

	
}

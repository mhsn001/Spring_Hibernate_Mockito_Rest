package com.khmo.test.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.khmo.test.domain.Test;

@Repository
public class TestDaoIml extends AbstractHibernateDao<Test>implements ITestDao {

	@Override
	public Map<String, String> test() {
		// TODO Auto-generated method stub
		System.out.println("************* Inside Dao");
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "ONE");
		map.put("two", "TWO");
		map.put("three", "THREE");
		return map;
	}
}

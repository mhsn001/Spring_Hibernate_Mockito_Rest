package com.khmo.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmo.test.dao.ITestDao;

@Service
public class TestServiceImpl implements ITestService{

	@Autowired
	ITestDao testDao;
	
	@Override
	public Map<String, String> test() {
		Map<String, String> map = testDao.test();
		return map;
	}
	
}

package spring.web.ch09.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.web.ch09.dao.XDao;

@Service
public class XServiceImpl implements XService {
	@Autowired private XDao xDao;
	
	@Transactional
	@Override
	public int addNum() {
		int cnt = 0;
		cnt = xDao.insertNext();
		cnt += xDao.insertNext();
		
		return cnt;
	}
	
	@Transactional
	@Override
	public int addNum2() {
		xDao.insertNext();
		xDao.insertCurr();
		
		return 1;
	}
	
	@Override
	public int addNum2NoX() {
		xDao.insertNext();
		xDao.insertCurr();
		
		return 1;
	}
	
	@Transactional
	@Override
	public int addNum3() {
		xDao.insertNext();
		int tmp = 3 / 0;
		
		return 1;
	}
	
	@Override
	public List<Integer> getNums() {
		return xDao.selectXs();
	}
}

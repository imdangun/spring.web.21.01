package spring.web.ch09.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch09.dao.map.XMap;

@Repository
public class XDaoImpl implements XDao {
	@Autowired private XMap xMap;
	
	@Override
	public int insertNext() {
		return xMap.insertNext();
	}
	
	@Override
	public int insertCurr() {
		return xMap.insertCurr();
	}
	
	@Override
	public List<Integer> selectXs() {
		return xMap.selectXs();
	}
}

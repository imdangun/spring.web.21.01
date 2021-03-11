package spring.web.ch09.dao;

import java.util.List;

public interface XDao {
	int insertNext();
	int insertCurr();
	List<Integer> selectXs();
}

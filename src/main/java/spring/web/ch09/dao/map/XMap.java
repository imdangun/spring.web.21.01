package spring.web.ch09.dao.map;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface XMap {
	@Insert("insert into x values (x_seq.nextval)")
	int insertNext();
	
	@Insert("insert into x values (x_seq.currval)")
	int insertCurr();
	
	@Select("select x from x order by x")
	List<Integer> selectXs();
}

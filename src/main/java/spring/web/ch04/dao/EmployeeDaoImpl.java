package spring.web.ch04.dao;

import org.springframework.beans.factory.annotation.Autowired;

import spring.web.ch04.dao.map.EmployeeMap;
import spring.web.ch04.domain.Employee;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired private EmployeeMap empMap;
	
	@Override
	public Employee selectEmployee(int empId) {
		return empMap.selectEmployee(empId);
	}
}

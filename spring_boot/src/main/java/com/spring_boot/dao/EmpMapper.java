package com.spring_boot.dao;

import org.springframework.stereotype.Repository;

import com.spring_boot.bean.EmpBean;

@Repository
public interface EmpMapper {

	EmpBean findEmpInfo(Integer empNo);//select by emNo

	int addEmpInfo(EmpBean empBean);//addEmp

	int alterEmpInfo(EmpBean emp);//alteremp	
	
	int deletEmpInfo(int id);//deleteEmpInfo

}

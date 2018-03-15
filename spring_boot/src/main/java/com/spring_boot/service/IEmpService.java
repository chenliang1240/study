package com.spring_boot.service;

import com.spring_boot.bean.EmpBean;

public interface IEmpService {

	EmpBean findEmpInfo(Integer empNo);//select the empinfo

	int addEmpInfo(EmpBean empBean);//addEmpInfo

	int alterEmpInfo(EmpBean emp);//alteremp
	
	int deletEmpInfo(int id);//deleteEmpInfo
}

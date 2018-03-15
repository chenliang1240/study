package com.spring_boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.bean.EmpBean;
import com.spring_boot.dao.EmpMapper;
import com.spring_boot.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService{
	@Autowired
	EmpMapper empMapper;
	@Override
	public EmpBean findEmpInfo(Integer empNo) {
		// TODO Auto-generated method stub
		return empMapper.findEmpInfo(empNo);
	}
	@Override
	public int addEmpInfo(EmpBean empBean) {
		// TODO Auto-generated method stub
		return empMapper.addEmpInfo(empBean);
	}
	@Override
	public int alterEmpInfo(EmpBean emp) {
		// TODO Auto-generated method stub
		return empMapper.alterEmpInfo(emp);
	}
	@Override
	public int deletEmpInfo(int id) {
		// TODO Auto-generated method stub
		return empMapper.deletEmpInfo(id);
	}

}

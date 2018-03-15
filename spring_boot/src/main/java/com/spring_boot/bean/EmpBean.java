package com.spring_boot.bean;

public class EmpBean {
	private Integer empNo;
	private String empName;
	private String empPwd;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public EmpBean(Integer empNo, String empName, String empPwd) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empPwd = empPwd;
	}

	public EmpBean() {
		super();
	}

	@Override
	public String toString() {
		return "EmpBean [empNo=" + empNo + ", empName=" + empName + ", empPwd=" + empPwd + "]";
	}

}

package com.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.bean.EmpBean;
import com.spring_boot.service.IEmpService;
@Controller
/*@RestController */// RestController：该注解作用等同于Controller加上json格式的数据
@ComponentScan("com.spring_boot.service")
public class EmpController {
	@Autowired
	IEmpService iEmpService;

	@RequestMapping("getEmpInfoById/{empNo}")
	public String getEmpInfobyId(@PathVariable("empNo") Integer empNo,Model model) {
		System.out.println(empNo);
		EmpBean empBean = iEmpService.findEmpInfo(empNo);
		model.addAttribute("emp",empBean );
		return "EmpInfo";
	}

	@RequestMapping(method = RequestMethod.POST, value = "addEmpInfo")
	public String addEmpInfo(@RequestBody EmpBean empBean) {
		System.out.println(empBean);
		if (empBean != null) {
			int result = iEmpService.addEmpInfo(empBean);
			if (result != 0) {
				return "添加成功";
			} else {
				return "添加失败";
			}
		}
		return "添加异常";
	}

	@RequestMapping("alterEmpInfo")
	public String alterEmpInfo(@RequestBody EmpBean emp) {
		if (emp != null) {
			int result = iEmpService.alterEmpInfo(emp);
			if (result != 0) {
				return "修改成功";
			} else {
				return "修改失败";
			}
		}
		return "操作异常！";
	}

	@RequestMapping("deletEmpInfo")
	public String deleteEmpInfo(Integer id) {
		System.out.println(id);
		if (id != null) {
			int result = iEmpService.deletEmpInfo(id);
			if (result != 0) {
				return "删除成功";
			} else {
				return "删除失败";
			}
		}
		return "删除异常！";
	}

}

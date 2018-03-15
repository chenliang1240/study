package spring_boot;

import org.junit.Test;

import com.spring_boot.bean.EmpBean;
import com.spring_boot.service.IEmpService;
import com.spring_boot.service.impl.EmpServiceImpl;

public class EmpTest {

	@Test
	public void empTest() {
		IEmpService iEmpServer = new EmpServiceImpl();
		int empNo = 1;
		EmpBean empBean = iEmpServer.findEmpInfo(empNo);
		System.out.println(empBean);
	}

}

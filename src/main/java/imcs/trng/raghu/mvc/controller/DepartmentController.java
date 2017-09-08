package imcs.trng.raghu.mvc.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import imcs.trng.raghu.mvc.model.Department;
import imcs.trng.raghu.mvc.service.DepartmentService;

@Controller
public class DepartmentController {
	 
	final static Logger logger=Logger.getLogger(DepartmentController.class);
	@Autowired
	DepartmentService deptService;
	
	@RequestMapping(value="/department",method = RequestMethod.GET)
	public String departmentPage() {
		return "department";
	}
	@RequestMapping(value = "/findDepartment", method = RequestMethod.GET)
	public ModelAndView getDepartment(@RequestParam int deptNo) throws SQLException {
		logger.debug("find department controller");
		Department dept = deptService.getDepartment(deptNo);
		ModelAndView model = new ModelAndView("department");
		if (null != dept) {
			model.addObject("department",dept);
			
		} else {
			model.addObject("deptMsg", "Department not found for Id : "+deptNo);
			model.addObject("department", null);
		}
		return model;
	}
}

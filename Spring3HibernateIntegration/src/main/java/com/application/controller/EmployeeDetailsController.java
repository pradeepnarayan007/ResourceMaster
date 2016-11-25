package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.application.entity.Employee;
import com.application.entity.EmployeeTrainingDetailsEntity;
import com.application.entity.TrainingMasterEntity;
import com.application.service.EmployeeDetailsService;




@Controller
@EnableWebMvc
public class EmployeeDetailsController {
	
	@Autowired
	EmployeeDetailsService employeeDetailsServiceImpl;
	
	public void setEmployeeDetailsServiceImpl(EmployeeDetailsService employeeDetailsServiceImpl) {
		this.employeeDetailsServiceImpl = employeeDetailsServiceImpl;
	}


	//@RequestMapping(value="/getemployeedetails",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
	 @RequestMapping(value = "/getemployeedetails", method = RequestMethod.GET, produces="application/json")
	public  @ResponseBody List<EmployeeTrainingDetailsEntity> getEmployeeDetails(@ModelAttribute("employee") Employee emp){
		List<EmployeeTrainingDetailsEntity> trainingDetails = null;
		try{
			System.out.println(" get rest controller");
			System.out.println(" $$$ "+emp.getEmpId() );
			trainingDetails = employeeDetailsServiceImpl.getTrainingDetails(Integer.parseInt(emp.getEmpId()));
						
		}catch (Exception e) {
			e.printStackTrace();
		}
		return trainingDetails;
	}
	
	

	@RequestMapping(value="/saveEmployeeDetails",method=RequestMethod.POST)
	public String saveEmployeeDetails(@ModelAttribute("employee") Employee emp){
		int level=0;
		int resourcetype = 0;
		int account = 0;
		try{
			System.out.println(" rest controller"+emp.getLevel());
			if(emp.getLevel()!=null && !emp.getLevel().isEmpty() )
			{	
			 level=Integer.parseInt(emp.getLevel());
			}
			if(emp.getResourceType()!=null && !emp.getResourceType().isEmpty())
			{
			 resourcetype=Integer.parseInt(emp.getResourceType());
			}
			if(emp.getAccount()!=null && !emp.getAccount().isEmpty())
			{
			 account=Integer.parseInt(emp.getAccount());
			}
			employeeDetailsServiceImpl.saveTrainingDetails(emp.getEmpId(),level,resourcetype,account);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return "message";
	}

}

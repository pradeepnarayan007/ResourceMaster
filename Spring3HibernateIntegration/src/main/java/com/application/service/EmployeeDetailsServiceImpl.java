package com.application.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.dao.EmployeeDetailsDao;
import com.application.entity.Employee;
import com.application.entity.EmployeeTrainingDetailsEntity;
import com.application.entity.TrainingMasterEntity;




@Repository
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService{
	
	@Autowired
	private EmployeeDetailsDao trainingMasterEntity  ;
	





/*
	@Autowired
	EmployeeDetailsDao empDetailDao;
	
	public void getEmployeeDetails(Employee emp) {
		
	}

	public List<TrainingMasterEntity> getTrainingDetails(Employee emp) {
		try{
			return empDetailDao.getTrainingDetails(emp);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/

	@Transactional
	public List<EmployeeTrainingDetailsEntity> getTrainingDetails(int emp) {
		return trainingMasterEntity.getTrainingDetails(emp);
		
	}



	@Transactional
	public void saveTrainingDetails(String emp,int level,int resourcetype,int account) {
		
		trainingMasterEntity.saveTrainingDetails(emp,level,resourcetype,account);
	}
	
	/*public void saveTrainingDetails(Employee emp) {
		try{
			List<TrainingMasterEntity> trainingMasterDetails = empDetailDao.getTrainingDetails(emp);
			
			if(trainingMasterDetails != null && !trainingMasterDetails.isEmpty()){
				for(TrainingMasterEntity entity : trainingMasterDetails){
					EmployeeTrainingDetailsEntity empTrainingDetailsObj = getDTO(entity,emp.getEmpId());
					//empDetailDao.saveTrainingDetails(empTrainingDetailsObj);
				}
				empDetailDao.saveTrainingDetails(trainingMasterDetails);
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private EmployeeTrainingDetailsEntity getDTO(TrainingMasterEntity trainingMasterDetails,String empid) {
		
		EmployeeTrainingDetailsEntity empTrainingDetailsObj = new EmployeeTrainingDetailsEntity();
		
		try{
			empTrainingDetailsObj.setEmpId(Integer.parseInt(empid));
			empTrainingDetailsObj.setCourseId(trainingMasterDetails.getCourseId());
			empTrainingDetailsObj.setCourseName(trainingMasterDetails.getCourseName());
			//sempTrainingDetailsObj.setCourseStartDate(new Timestamp(new Date().getTime()));
			empTrainingDetailsObj.setCourseLink(trainingMasterDetails.getCourseURL());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empTrainingDetailsObj;
	}
*/
}

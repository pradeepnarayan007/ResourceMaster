package com.application.service;

import java.util.List;

import com.application.entity.Employee;
import com.application.entity.EmployeeTrainingDetailsEntity;
import com.application.entity.TrainingMasterEntity;





public interface EmployeeDetailsService {

	public List<EmployeeTrainingDetailsEntity> getTrainingDetails(int emp);
	
	public void saveTrainingDetails(String emp,int level,int resourcetype,int account);

}

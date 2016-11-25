package com.application.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.application.entity.Employee;
import com.application.entity.EmployeeTrainingDetailsEntity;
import com.application.entity.TrainingMasterEntity;





public interface EmployeeDetailsDao {

	//public void getMandatoryTrainings(String var);

	public List<EmployeeTrainingDetailsEntity> getTrainingDetails(int emp);
	
	public void saveTrainingDetails(String emp,int level,int resourcetype,int account);
	
}

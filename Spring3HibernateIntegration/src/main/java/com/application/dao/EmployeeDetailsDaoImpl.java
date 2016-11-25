package com.application.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.application.entity.Employee;
import com.application.entity.EmployeeTrainingDetailsEntity;
import com.application.entity.TrainingMasterEntity;

@Repository
public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<EmployeeTrainingDetailsEntity> getTrainingDetails(int emp) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(EmployeeTrainingDetailsEntity.class);
		cr.add(Restrictions.eq("empId", emp));
		List<EmployeeTrainingDetailsEntity> results = cr.list();
		return results;
	}

	public void saveTrainingDetails(String emp, int level, int resourcetype, int account) {
		System.out.println("going to persist");
		String sqlquery = "";
		sqlquery = "select * from training_master where COURSE_TYPE=:COURSE_TYPE ";
		if (resourcetype != 0)
			sqlquery = sqlquery + " union select * from training_master where COURSE_ROLE_ID=:COURSE_ROLE_ID";
		if (account != 0)
			sqlquery = sqlquery + " union select * from training_master where COURSE_TOWER=:COURSE_TOWER";
		if (level != 0)
			sqlquery = sqlquery + " union select * from training_master  where COURSE_LVL=:COURSE_LVL";

		sqlquery = sqlquery + " union select * from training_master where STATUS=:STATUS";

		Session session = this.sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sqlquery);
		query.addEntity(TrainingMasterEntity.class);
		if (level != 0)
			query.setParameter("COURSE_LVL", level);
		if (resourcetype != 0)
			query.setParameter("COURSE_ROLE_ID", resourcetype);
		if (account != 0)
			query.setParameter("COURSE_TOWER", account);
		query.setParameter("COURSE_TYPE", "mandatory");
		query.setParameter("STATUS", "1");
		List<TrainingMasterEntity> results = query.list();
		for (TrainingMasterEntity entity : results) {
			EmployeeTrainingDetailsEntity empTrainingDetailsObj = getDTO(entity, emp);
			session.persist(empTrainingDetailsObj);
		}
		System.out.println("success");

	}

	private EmployeeTrainingDetailsEntity getDTO(TrainingMasterEntity trainingMasterDetails, String empid) {

		EmployeeTrainingDetailsEntity empTrainingDetailsObj = new EmployeeTrainingDetailsEntity();

		try {
			empTrainingDetailsObj.setEmpId(Integer.parseInt(empid));
			empTrainingDetailsObj.setCourseId(trainingMasterDetails.getCourseId());
			empTrainingDetailsObj.setCourseName(trainingMasterDetails.getCourseName());
			// empTrainingDetailsObj.setCourseStartDate(new Timestamp(new
			// Date().getTime()));
			empTrainingDetailsObj.setCourseLink(trainingMasterDetails.getCourseURL());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empTrainingDetailsObj;
	}

}

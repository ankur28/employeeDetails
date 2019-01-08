package org.mav_proj.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mav_proj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

  /* @Override
   @Transactional
    public void save(Employee e) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
   }*/

    @Override
    public List<Employee> getEmployee() {
        Session session = this.sessionFactory.openSession();

        Criteria cr = session.createCriteria(Employee.class);
        List results = cr.list();
       // List<Employee> empList = session.createQuery("Select * from employee_table").list();
        //session.close();

        return results;
}}

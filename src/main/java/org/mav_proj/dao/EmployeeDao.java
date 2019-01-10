package org.mav_proj.dao;

import org.mav_proj.model.Employee;

import java.util.List;

public interface EmployeeDao {





        void save(Employee employee);

        public List<Employee> getEmployee();

}


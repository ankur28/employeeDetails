package org.mav_proj.pages;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.mav_proj.dao.EmployeeDao;
import org.mav_proj.model.Employee;

import java.util.List;

public class ManageEmployee {

@Inject
private EmployeeDao employeeDao;

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /*public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
   }*/

    public List<Employee> getEmployees(){

        return employeeDao.getEmployee();
    }

    }


package org.mav_proj.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.mav_proj.dao.EmployeeDao;
import org.mav_proj.model.Employee;


public class AddEmployee {

    @Persist
    @Property
    private int id;

    @Property
    private String lastname;

    @Property
    private String firstname;

    @Property
    private String dept;

    @Component
    private Form addForm;



    @InjectPage
    private ManageEmployee manageEmployee;

    @Inject
    private EmployeeDao employeeDao;

    public void saveEmp(Employee employee){
        employeeDao.save(employee);
    }


    Object onSuccessFromAddForm() {

        Employee emp=new Employee();
        emp.setId(id);
        emp.setFirstname(firstname);
        emp.setLastname(lastname);
        emp.setDept(dept);

        employeeDao.save(emp);

        return manageEmployee;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.oracle.explorer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class Department{
    
    private String department_name;
    
    //list of employees in the department
    private List<Employee> DepartmentEmployees = new ArrayList<Employee>();

    public Department(String department_name) {
        this.department_name = department_name;
    }
    

    /**
     * @return the MyEmployees
     */
    public List<Employee> getMyEmployees() {
        return DepartmentEmployees;
    }
    
    /**
     * @return the MyEmployees size
     */
    public int getMyEmployeesSize() {
        return DepartmentEmployees.size();
    }

    /**
     * @param MyEmployees the MyEmployees to set
     */
    public void DepartmentEmployees(List<Employee> MyEmployees) {
        //grant max capacity is 10
        if (MyEmployees.size()>=10) {
            System.out.println("can not add more employees, max capacity reached");
        } else {
            for (Iterator<Employee> iterator = MyEmployees.iterator(); iterator.hasNext();) {
                Employee next = iterator.next();
                this.DepartmentEmployees.add(next);
                 System.out.println(next.toString());
            }//end for
        }
    }
    
    /*
    *  get employee by id
    */
    public Employee getEmployeebyId(int the_id){
        Employee my_employee = null;
         for (Iterator<Employee> iterator = DepartmentEmployees.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            int employee_id = next.getId();
             if (employee_id==the_id) {
                 return next;
             }
        }//end for
         return my_employee;
    }//end method
    
    //get total salaries
    public double  totalSalariesperDepartment() {
        double total_salaries =0.0;
        if (!this.DepartmentEmployees.isEmpty()) {
            for (Iterator<Employee> iterator = this.DepartmentEmployees.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            double employee_salary = next.getSalary();
            total_salaries =  employee_salary+total_salaries;
            }//end for
        }
        return total_salaries;
        
    }//totalSalariesperDepartment
    
    //gettin av salaries, 
    //get total salaries
    public double  avSalariesperDepartment() {
        double total_av_salaries =0.0;
        if (!this.DepartmentEmployees.isEmpty()) {
            total_av_salaries = this.totalSalariesperDepartment()/this.DepartmentEmployees.size();
        }
        return  total_av_salaries;
    }//get av salaries

    /**
     * @return the department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * @param department_name the department_name to set
     */
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    
    //commentarios
    // Overriding toString() method of String class
    @Override
    public String toString() {
        return this.department_name;
    }
    
}



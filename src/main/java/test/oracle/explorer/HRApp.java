/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.oracle.explorer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Luis Ramos
 */
public class HRApp {
    
    public static void main(String[] args)  {
        //greeting to user
        System.out.print("Hello, this is HRApp system \n");
        //array for employees, to list all of them
        List<Employee> MyEmployees = new ArrayList<Employee>();
        //list of departments
        List<Department> MyDepartments = new ArrayList<Department>();
        //string for user answer
        String user_answer;
        boolean user_decision = false;
        //terminal reader
        //Preparin´g for using Scanner
        Scanner scanner = new Scanner(System.in);
        
       
         //ask about employees
        do {
            System.out.print("do you want to create a  new department (yes/no) \n");
            user_answer = scanner.nextLine();
            if (user_answer.equalsIgnoreCase("yes")) {
                user_decision = true;
                System.out.print("please, provide a department name \n");
                String department_name = scanner.nextLine();
                Department my_department = new Department(department_name);
                //adding to departments list
                MyDepartments.add(my_department);
                //we want to add employees to the department
                boolean employee_decission=false;
                do {                    
                    System.out.print("do you want to add a new employee to this department (yes/no) \n");
                    // Reading data using readLine
                    user_answer = scanner.nextLine();
                    if (user_answer.equalsIgnoreCase("yes")) {
                        employee_decission = true;
                        int user_id;
                        String name;
                        double salary;
                        //System.out.print("creating object \n");
                        //getting individual information
                        System.out.print("please provide employee name: \n ");
                        name = scanner.nextLine();
                        System.out.print("please provide employee salary: \n ");
                        salary = Float.parseFloat(scanner.nextLine());
                        System.out.print("please provide employee id: \n ");
                        user_id = Integer.parseInt(scanner.nextLine());
                        //create individual 
                        Employee my_employee = new Employee(user_id, name, salary);
                        //adding it to the department
                        MyEmployees.add(my_employee);
                        System.out.println("added: "+my_employee.toString()+"\n");
                        System.out.println("total added: "+MyEmployees.size());
                    }
                    else{
                         employee_decission = false;
                    }
                } while (employee_decission);
                 
                 //add all employees to the department
                 if (!MyEmployees.isEmpty()) {
                     System.out.println("adding employees to department");
                    my_department.DepartmentEmployees(MyEmployees);
                }
                
                //no more employees to add
                //getting total salaries in this deparment, if any employee
                if (my_department.getMyEmployeesSize()>0) {
                    System.out.print("total salaries paid in "+my_department.toString()+" = "+my_department.totalSalariesperDepartment()+"\n");
                    
                    System.out.print("avaerage salaries paid in "+my_department.toString()+" = "+my_department.avSalariesperDepartment()+" \n");
                    
                }
                else{
                     System.out.println("no employees, nothing to report");
                }
            } else {
                //ending loop
                user_decision = false;
                //asking for listing all departments
                System.out.print("do you want to list all deparments (yes/no) \n");
                user_answer = scanner.nextLine();
                if (user_answer.equalsIgnoreCase("yes")) {
                    for (Iterator<Department> iterator = MyDepartments.iterator(); iterator.hasNext();) {
                        Department next = iterator.next();
                        System.out.println("department "+next.toString()+" \n");
                    }
                } 
            }
   
        } while (user_decision);

        
        
  
    }//end of main
    
}//end main class 



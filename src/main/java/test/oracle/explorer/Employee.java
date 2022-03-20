/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.oracle.explorer;

/**
 *
 * @author User
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    
    //constructor of employee

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Overriding toString() method of String class
    @Override
    public String toString() {
        return "Employee " + this.getName() + " with ID " + this.getId() + ", earns: " +this.getSalary() +"\n";
    }
}



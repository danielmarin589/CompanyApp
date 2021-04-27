package lab2;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		List<Department> departments = new ArrayList<Department>();
		
		//implemented methods
        
        //sortBySalaryDesc 	 - sort salaries from a department decreasingly
        //addEmployee   	 - add an employee to a department
        //removeEmployee 	 - remove an employee from a department
        //getDepartment  	 - display all employees from a given department
		
		departments.add(new Department("Computer Science"));
		departments.add(new Department("Electronics"));
		departments.add(new Department("Mechanics"));
		departments.add(new Department("Human Resources"));		
		
		
		departments.get(0).addEmployee(new Employee("Daniel Marin","Intern",2300,20));
		departments.get(0).addEmployee(new Employee("Andrei Popescu","Software Engineer",4200,26));
		departments.get(0).addEmployee(new Employee("Vali Adam","Web Developer",2700,28));
		departments.get(0).addEmployee(new Employee("Fabian Ionescu","Intern",2200,23));
		departments.get(0).addEmployee(new Employee("Mihai Dumitrescu","Software Engineer",3800,29));
		
		departments.get(1).addEmployee(new Employee("Gabriel Georgescu","Maintenance Engineer",4500,32));;
		departments.get(1).addEmployee(new Employee("Darius Ioan","Electrical Design Engineer",5400,37));
		departments.get(1).addEmployee(new Employee("Stefan Alexandrescu","Intern",2800,24));
		departments.get(1).addEmployee(new Employee("Marius Panait","Quality Assurance",3400,25));
		departments.get(1).addEmployee(new Employee("Bogdan Dobrescu","Hardware Inspector",3700,31));
		
		departments.get(2).addEmployee(new Employee("Adrian Munteanu","Service Technician",3600,30));
		departments.get(2).addEmployee(new Employee("Rares Stoian","Intern",2400,22));
		departments.get(2).addEmployee(new Employee("Antonio Popa","Automotive Technical Inspector",3900,41));
		departments.get(2).addEmployee(new Employee("Mircea Dumitru","Intern",2600,23));
		departments.get(2).addEmployee(new Employee("Mihnea Lazar","Mechanic Operator",3500,33));
		
		departments.get(3).addEmployee(new Employee("Razvan Ciobanu","Services Manager",3500,32));
		departments.get(3).addEmployee(new Employee("Eugen Neagu","Digital Specialist",5400,26));
		departments.get(3).addEmployee(new Employee("Ciprian Barbu","Junior Recruiter",2900,24));
		departments.get(3).addEmployee(new Employee("Flavius Cojocaru","Operational Design Specialist",3200,35));
		departments.get(3).addEmployee(new Employee("Matei Dobre","Management Trainer",3500,37));
        
       
        Company c1 = new Company("MyCompany", departments); //the company contains all the departments
             
        
        //print normally employees from department 2
        for(Employee e : departments.get(1).getEmployees() ) {
        	e.print();
        }
        
        //sort
        departments.get(1).sortBySalaryDesc();
        
        System.out.println(" ");//space
        
        //print after sorting
        for(Employee e : departments.get(1).getEmployees()) {
        	System.out.println(e.getName() + " " + e.getSalary());
        }
       
        System.out.println(" ");//space
        
        //add an employee to department 4
        departments.get(3).addEmployee(new Employee("Matei Albu","Intern",3500,23));
        
        //print names of all employees from dep4 (our new employee should be there)
        for(Employee e : departments.get(3).getEmployees()) {
        	System.out.println(e.getName());
        }
        
        
        System.out.println(" ");//space
        
        
        //delete an employee from dep4
        departments.get(3).removeEmployee("Matei Albu");
       
        //print the department again
        for(Employee e : departments.get(3).getEmployees()) {
        	System.out.println(e.getName());
        }
        
        System.out.println(" ");//space
        
        //print all employees from electronics department
        for(Employee e : c1.getDepartment("Electronics").getEmployees()) {
        	e.print();
        }
        
        
	}
}

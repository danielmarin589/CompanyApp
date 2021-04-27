package lab2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Department {
	
	private String name;
	List<Employee> employees;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(String name) {
		this.name = name;
		employees = new ArrayList<Employee>();
		
	}
	
	public void sortBySalaryDesc() {
		
		
		employees.sort((Employee e1, Employee e2)->((int)e2.getSalary()-(int)e1.getSalary()));
	}
	
	public void addEmployee(Employee e1) {
		employees.add(e1);
	}
	
	public void removeEmployee(String name) {
		Iterator itr = employees.iterator(); 
        while (itr.hasNext()) 
        { 
           Employee e = (Employee)itr.next();
            if (e.getName().equals(name)) { 
                itr.remove(); 
                break;
            } 
        }
	

	}
}

package lab2;

import java.util.Iterator;
import java.util.List;

public class Company {

	private String name;
	List<Department> departments;
	//List<Department> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	
	
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


	public Company(String name, List<Department> departments) {
		this.name = name;
		this.departments = departments;
	}
	
	public Department getDepartment(String name) {
		
	Iterator itr = departments.iterator(); 
    while (itr.hasNext()) 
    { 
       Department d = (Department)itr.next();
        if (d.getName().equals(name)) { 
            return d;
        } 
        
    }
	return null;
}

	
	
}

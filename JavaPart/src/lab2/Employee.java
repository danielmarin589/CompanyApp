package lab2;

public class Employee {
	
	private String name;
	
	private String title;
	
	private double salary;
	private int age;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Employee(String name, String title, double salary, int age) {
		this.name = name;
		
		this.title = title;
		this.salary = salary;
		this.age = age;
		
	}
	
	public Employee(Employee auxEmployee) {
		this.name = auxEmployee.name;
		
		this.title = auxEmployee.title;
		this.salary = auxEmployee.salary;
		this.age = auxEmployee.age;
		
	} 
	
	
	void print() {
		System.out.println("Full Name: " + name );
		System.out.println("Title: " + title);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
	
	
	

}

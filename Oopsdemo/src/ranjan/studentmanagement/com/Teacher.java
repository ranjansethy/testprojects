package ranjan.studentmanagement.com;
/**
 * created a class
 * @author Ranjan
 *
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	//initializing the parameters
	
	public Teacher(int id, String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
//return the teacher id
	public int getId() {
		return id;
	}
//to set the value of id
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}

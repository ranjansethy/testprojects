package ranjan.studentmanagement.com;
//this is the class is to keep student details
public class Student {
	private int id;
	private String name;
	private int grade;
	private int fees_paid;
	private int fees_total;
//initialize the parameters by using constructor
	public Student(int id,String name,int grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.fees_total=30000;
		this.fees_paid=0;
		
	}
	/**
	 * we need to upgrade the grades bcoz the student will promote to the next grade each year
	 * @param grade
	 */
	public void setGrade(int grade){
		this.grade=grade;
	}
	/**
	 * fees need to be paid installment way or fully
	 * @param fees
	 */
	public void updateFees(int fees){
		fees_paid+=fees;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFees_paid() {
		return fees_paid;
	}
	
	public int getFees_total() {
		return fees_total;
	}
	
	public int getGrade() {
		return grade;
	}
	
	


}
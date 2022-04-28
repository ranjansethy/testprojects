package ranjan.studentmanagement.com;

import java.util.List;

public class School {
private List<Teacher> teacher;
private List<Student> student;
private int total_money_earn;
private int total_money_spent;


public School(List<Teacher> teacher,List<Student> student){
	this.teacher=teacher;
	this.student=student;
	total_money_earn=0;
	total_money_spent=0;
}


public List<Teacher> getTeacher() {
	return teacher;
}


public void setTeacher(List<Teacher> teacher) {
	this.teacher = teacher;
}


public List<Student> getStudent() {
	return student;
}


public void setStudent(List<Student> student) {
	this.student = student;
}


public int getTotal_money_earn() {
	return total_money_earn;
}


public void setTotal_money_earn(int total_money_earn) {
	this.total_money_earn = total_money_earn;
}


public int getTotal_money_spent() {
	return total_money_spent;
}


public void setTotal_money_spent(int total_money_spent) {
	this.total_money_spent = total_money_spent;
}


}

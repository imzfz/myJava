package platform;

import java.util.ArrayList;

class tCourse {
	 private String courseName;
	 private ArrayList<String> students = new ArrayList<String>();
	 
	 public tCourse(){
		 
	 }
	 
	 public tCourse(String courseName){
		 this.courseName = courseName;
	 }
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public ArrayList<String> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	 
	public String toString(){
		String s="";
		for(int i=0;i<students.size();i++){
			s += students.get(i);
			s += " ";
		}
		return "课程名称 " + getCourseName() + "\n" + "选课人数 " + students.size() + "\n" + "学生名单 " + s;
	}
	
	public void addStudents(String student){
		this.students.add(student);
	}	
	public int getNumberOfStduents(){
		return this.students.size();
	}
}

public class Course {
	public static void main(String[] args){
		tCourse c = new tCourse("面向对象技术");
		c.addStudents("张三");
		c.addStudents("李四");
		c.addStudents("王五");
		System.out.println(c.toString());
	}
}



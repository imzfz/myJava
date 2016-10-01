package demo;

class Student{
	private int Number;
	private String Name;
	private float Score;
	public int getNumber(){
		return Number;
	}
	public void setNumber(int Number){
		this.Number = Number;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public float getScore(){
		return Score;
	}
	public void setScore(float Score){
		this.Score = Score;
	}
	public String toString(){
		return "学号：" + Number + "\n" + "姓名：" + Name + "\n" + "分数：" + Score ;
	}
	
}
class Teacher{
	private int Number;
	private String Name;
	private float Score;
	private float salary;
	public int getNumber(){
		return Number;
	}
	public void setNumber(int Number){
		this.Number = Number;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	
	public void setSalary(float salary){
		this.salary = salary;
	}
	public float getSalary(){
		return salary;
	}
	public String toString(){
		return "工号：" + Number + "\n" + "姓名：" + Name + "\n" + "工资：" + salary ;
	}
	
}

public class Homework2 {

	public static void main(String[] args) {
		Student stu = new Student();
		Teacher tec = new Teacher();
		stu.setNumber(1);
		stu.setName("ZhangFangzi");
		stu.setScore(100);
		System.out.println(stu.toString());
		tec.setNumber(555);
		tec.setName("xxxxx");
		tec.setSalary(8000);
		System.out.println(tec.toString());
	}

}

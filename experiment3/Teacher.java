package experiment3;

public class Teacher extends Person {	//继承person类
	private int gongHao;
	
	public Teacher(){
		
	}
	
	public Teacher(String name, char sex, Address adr, int gongHao){	//构造方法用super继承父类内容
		super.setName(name);
		super.setSex(sex);
		super.setAdr(adr);
		this.gongHao = gongHao;
	}
	
	public void setStudentGrade(Student s, int grade){		//设置学生成绩
		s.setGrade(grade); 
	}
}

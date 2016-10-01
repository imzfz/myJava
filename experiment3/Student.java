package experiment3;

public class Student extends Person {		//继承Person类
	private String stNo;
	private int grade;
	
	public Student(){
		
	}
	
	public Student(String name, char sex, Address adr, String stNo){	//super关键字设置父类的变量
		super.setName(name);
		super.setSex(sex);
		super.setAdr(adr);
		this.stNo = stNo;
	}
	
	public void setStNo(String stNo){		//set和get方法访问私有数据域
		this.stNo = stNo;
	}
	
	public String getStNo(){
		return stNo;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public String toString(){		//覆盖toString方法，输出
		return super.toString() + "\n" + "学号" + stNo + "\n" + "成绩" + grade;
	}
}

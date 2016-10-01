package platform;
/*
public class Test {
	public static void main(String[] args){
		Person p1 = new Person("张三","北京",111,"ab@126.com");
		Person p2 = new Person("李四","北京",222,"cd@126.com");
		Person p3 = new Person("王五","上海",333,"ef@126.com");
		Person p4 = new Person("赵六","上海",444,"hi@126.com");
		Person p5 = new Person("孙七","上海",555,"jk@126.com");
		Student st = new Student("李四","北京",222,"cd@126.com",1);
		Employee em = new Employee("王五","上海",333,"ef@126.com","二教",6000);
		Faculty fa = new Faculty("赵六","上海",444,"hi@126.com","二教",6000,9,3);
		Staff sf = new Staff("孙七","上海",555,"jk@126.com","三教",5000,"处级");
		
		System.out.println(p1.toString() + "\n");
		System.out.println(st.toString() + "\n");
		System.out.println(em.toString() + "\n");
		System.out.println(fa.toString() + "\n");
		System.out.println(sf.toString() + "\n");
	}
}

class Person{
	String name;
	String address;
	int tel;
	String email;
	
	public Person(){
		
	}
	
	public Person(String name,String address,int tel,String email){
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}
	public String toString(){
		return "姓名" + name + "\n" + "地址" + address + "\n" + "电话号码" + tel + "\n" +"电子邮件" + email;
	}
}

class Student extends Person{
	final int GRADE1 =1;
	final int GRADE2 =2;
	final int GRADE3 =3;
	final int GRADE4 =4;
	int grade = GRADE1;
	
	public Student(){
		
	}
	public Student(String name,String address,int tel,String email,int grade){
		super.name = name;
		super.address = address;
		super.tel = tel;
		super.email = email;
		this.grade = grade;
	}
	
	public String toString(){
		return super.toString() + "\n" + "年级" + grade;
	}
}

class Employee extends Person{
	String office;
	int salary;
	final String OFFICE1 = "一教", OFFICE2 = "二教", OFFICE3 = "三教";
	
	public Employee(){
		
	}
	public Employee(String name,String address,int tel,String email,String office,int salary){
		super.name = name;
		super.address = address;
		super.tel = tel;
		super.email = email;
		this.office = office;
		this.salary = salary;
	}	
	
	public String toString(){
		return super.toString() + "\n" + "办公室" + office + "\n" + "工资" + salary;
	}
}

class Faculty extends Employee{
	int time;
	final int ZHUJIAO = 1 , JIANGSHI = 2 , FUJIAOSHOU = 3 , JIAOSHOU = 4;
	int job;
	
	public Faculty(){
		
	}
	public Faculty(String name,String address,int tel,String email,String office,int salary,int time,int job){
		super.name = name;
		super.address = address;
		super.tel = tel;
		super.email = email;
		this.time = time;
		super.office = office;
		super.salary = salary;
		this.job = job;
	}
	
	public String toString(){
		return super.toString() + "\n" + "办公时间" + time +"点\n"+ "职称" + job;
	}
}

class Staff extends Employee{
	final String KEJI = "科级" , CHUJI = "处级";
	String zhiwu;
	
	public Staff(){
		
	}
	public Staff(String name,String address,int tel,String email,String office,int salary , String zhiwu){
		super.name = name;
		super.address = address;
		super.tel = tel;
		super.email = email;
		super.office = office;
		super.salary = salary;
		this.zhiwu = zhiwu;
	}
	
	public String toString(){
		return super.toString() + "\n" + "职务" + zhiwu;
	}
}*/

public class Test{
	public static void main(String[] args){
		Student s = new Student("Tom",Student.FRESHMAN);
		Faculty f = new Faculty("Jerry",Faculty.ASSOCIATE_PROFESSOR);
		System.out.println(s.toString() + "所属社团" + s.volunteer("北京青年志愿者协会") + "\n");
		System.out.println(f.toString() + "所属社团" + f.volunteer("北京市慈善义工协会"));
	}
}


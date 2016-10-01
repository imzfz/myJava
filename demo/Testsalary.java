package demo;

public class Testsalary {
	public static void main(String[] args){
		Company c = new Company();
	//	c.emp[0].setName("张三");
		c.emp[1].setName("李四");
		c.emp[2].setName("王五");
		c.emp[0].yearSal=72000.0;
		c.emp[1].yearSal=765000.0;
		c.emp[2].yearSal=84000.0;
		System.out.println("公司每年支付给员工的工资是:" + c.computeTotalSal(232500.0));
		System.out.println("姓名:" + c.emp[0].name + "年收入:" + c.emp[0].yearSal);
		System.out.println("姓名:" + c.emp[1].name + "\n" + "年收入:" + c.emp[1].yearSal);
		System.out.println("姓名:" + c.emp[2].name + "\n" + "年收入:" + c.emp[2].yearSal);
	}
}

class Company{
	Employee[] emp = new Employee[3];
	double totalSal;
	
	public double computeTotalSal(double totalSal){
		this.totalSal = totalSal;
		return totalSal;
	}
	
	public String outPut(){
		return "";
	}
}

abstract class Employee{
	String name;
	double yearSal;
	
	public abstract double earnings();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class MonthWorker extends Employee{
	double monthsal;
	
	public MonthWorker(){
		
	}
	MonthWorker(float monthsal){
		this.monthsal = monthsal;
	}

	public double earnings(){
		return monthsal * 12;
	}

	public String toString(){
		return "姓名" + super.name +"年收入" + earnings();
	}

	public double getMonthSal(){
		return monthsal;
	}

	public void setMonthSal(double monthsal){
		this.monthsal = monthsal;
	}
}


class WeekWorker extends Employee{
	double weekSal;
	
	public WeekWorker(){
		
	}

	public WeekWorker (double weekSal){
		this.weekSal = weekSal;
	}

	public double earnings(){
		return weekSal * 54;
	}

	public String toString(){
		return "姓名" + super.name +"年收入" + earnings();
	}

	public double getWeekSal() {
		return weekSal;
	}

	public void setWeekSal(double weekSal) {
		this.weekSal = weekSal;
	}

	
}

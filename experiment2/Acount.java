package experiment2;
import java.util.Date;

public class Acount {		//定义相关变量，设置为私有属性
	private int id = 0;
	private double balance = 0;
//	private double annualInterestRate = 0;
	private Date dateCreated;
	Date now = new Date();
	
	public Acount(){		//无参构造方法 自动创建日期
		dateCreated = new Date();
	
	}
	
	public Acount(int id,double balance){		//构造方法用于输入相关值
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
//		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {		//创建变量的set方法和get方法
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
/*
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	*/
	public void withDraw(double minus){		//减法
		balance -= minus;
	}
	
	public void deposit(double plus){		//加法
		balance += plus;
	}
	
	public static void main(String[] args){		//主函数用于实例化的对象，给方法传值
		Acount ac = new Acount(1122,20000);
		ac.setId(1122);
		ac.setBalance(20000);
//		ac.setAnnualInterestRate(0.045);;
		ac.withDraw(2500);
		ac.deposit(3000);
		System.out.println("账户是" + ac.getId());
		System.out.println("余额是" + ac.getBalance());
//		System.out.println(ac.getMonthlyInterestRate());
//		System.out.println(ac.getDateCreated());
	}
}

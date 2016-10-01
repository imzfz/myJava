package experiment3;

public class Person {
	protected String name;
	protected char sex;
	protected Address adr;
	
	public Person(){
		
	}
	
	public Person(String name, char sex, Address adr){
		this.name = name;
		this.sex = sex;
		this.adr = adr;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setAdr(Address adr){
		this.adr = adr;
	}
	
	public Address getAdr(){
		return adr;
	}
	
	public String toString(){
		return "姓名" + name + "\n" + "性别" + sex + "\n" + "住址" + adr;
	}
}

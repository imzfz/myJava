package experiment3;

public class Address {
	private String state;
	private String street;
	private String city;
	private String no;
	
	public Address(String s, String street, String city, String no){		//构造方法设置地址
		this.state = s;
		this.street = street;
		this.city = city;
		this.no = no;
	}
	
	public String toString(){		//输出地址
		return state + street + city + no;
	}
}

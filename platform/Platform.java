package platform;

public class Platform {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public Platform(){
		
	}
	public Platform(String name,int age,double weight,double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI(){
		return (weight/Math.pow(height,2));
	}
	
	public String getStatus(){
	//	Platform p = new Platform();
		String t = null;
		if(getBMI()<18.5)
			t = "过轻";
		if(getBMI()>=18.5 && getBMI()<24)
			t = "正常";
		if(getBMI()>=24)
			t = "超重";
		
		return t;
	}
	
	public static void main(String[] args){
		Platform p = new Platform("zhang",5,60,1.7);
	/*	String t = null;
		if(p.getBMI()<18.5)
			t = "过轻";
		if(p.getBMI()>=18.5 && p.getBMI()<24)
			t = "正常";
		if(p.getBMI()>=24)
			t = "超重";
			*/
		System.out.println(p.getBMI());
//		System.out.println(t);
		System.out.println(p.getStatus());
	}
	
	
}

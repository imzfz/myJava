package platform;

class Student extends Person implements Volunteer{
	private int grade;
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	
	public Student (String name,int grade){
		super(name);
		this.grade = grade;
	}

	public String toString(){
		return super.toString() + "\n" + "年级" + grade + "\n" ;
	}

	@Override
	public String volunteer(String organization) {
		// TODO Auto-generated method stub
		return organization;
	}
}

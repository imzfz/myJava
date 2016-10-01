package platform;

public class Faculty extends Person implements Volunteer{
	private String title;
	public static final String TEACHING_ASSISTANT = "助教";
	public static final String LECTURER = "讲师";
	public static final String ASSOCIATE_PROFESSOR = "副教授";
	public static final String PROFESSOR = "教授";
	
	public Faculty(String name,String title){
		super(name);
		this.title = title;
	}
	
	public String toString(){
		return super.toString() + "\n" + "职称" + title + "\n" ;
	}

	@Override
	public String volunteer(String organization) {
		// TODO Auto-generated method stub
		return organization;
	}
}

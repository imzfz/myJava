package demo;

public class ComputerStudent {
	private String collegeName;
	private double number;
	private String name;
	private String[] selected;
	private int count = 0;
	
	private class Course {
		private String courseName;
		private double coursePoint;
		private int selectNumber;
		public Course(){
			
		}
		
		private int[] whoSelect;
		
		public String getcourseName(){
			return courseName;
		}
		
		public void setcourseName(String courseName){
			this.courseName = courseName;
		}
		
		public double getcoursePoint(){
			return coursePoint;
		}
		
		public void setcoursePoint(double coursePoint){
			this.coursePoint = coursePoint;
		} 
		
		public int getselectNuber(){
			return selectNumber;
		}
		
	}
	
	//======================
	
	public ComputerStudent(){
		
	} 
	
	public ComputerStudent(double number, String name, int[] select){
		
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString(){
		return (collegeName + number + name );
	}
	
}


	
	
	
	
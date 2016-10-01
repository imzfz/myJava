package platform;

public class Circle extends GeometricObject{
	private double radius=10;
	
	public Circle(){
		
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
/*	public double getArea(){
		return Math.PI * radius * radius;
	}
*/
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}

	
	public String toString(){
		return "圆的半径是" + radius + "\n";
	}
/*
	public int compareTo(Circle o){
		int t=0;
		if(o.getPerimeter()==this.getPerimeter()){
			t=0;
		}
		if(o.getPerimeter()>this.getPerimeter()){
			t=1;
		}
		if(o.getPerimeter()<this.getPerimeter()){
			t=-1;
		}

		return t;
	}
	*/
	
	
	
}

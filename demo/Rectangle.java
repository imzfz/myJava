package demo;

public class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle(){
		
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return (width + height) * 2;
	}
	
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.width = 4;
		r1.height = 40;
		r2.width = 3.5;
		r2.height = 35.9;
		System.out.println("The area of a rectangle with " + r1.width + "and height " + r1.height + " is " + r1.getArea());
		System.out.println("The perimeter of a rectangle is " + r1.getPerimeter());
		System.out.println("The area of a rectangle with " + r2.width + " and height " + r2.height + " is " + r2.getArea());
		System.out.println("The perimeter of a rectangle is " + r2.getPerimeter());
	}
}

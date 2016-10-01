package demo;

public class Circle {
	private double radius;
	private int numberOfObjects;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
public static void main(String[] args){
	Circle c = new Circle();
	c.setRadius(1);
	System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
	c.setRadius(25);
	System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
	c.setRadius(125);
	System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
	c.setRadius(100);
	System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
	}
}
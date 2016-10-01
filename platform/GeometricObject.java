package platform;

import java.util.Date;

abstract class GeometricObject implements Comparable<GeometricObject>{
	private String color="White";
	private Date dateCreated = new Date();
	
	protected GeometricObject(){
		this.dateCreated = new Date();
	}
	
	protected GeometricObject(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
	public String toString(){
		return "颜色" + getColor() + "\n" ;
	}
	
//	public abstract double getArea();
	public abstract double getPerimeter();
	
	
	public int compareTo(GeometricObject o){
		int t=0;
//		GeometricObject object = (GeometricObject) o;
		if(o.getPerimeter()==getPerimeter()){
			t=0;
		}
		if(o.getPerimeter()>getPerimeter()){
			t=1;
		}
		if(o.getPerimeter()<getPerimeter()){
			t=-1;
		}

		return t;
	}

}
/*
class Triangle extends GeometricObject{
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(double s1, double s2, double s3, String color, boolean filled){
		super.setColor(color);
		super.setFilled(filled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public double getArea(){
		double p = (s1 + s2 + s3)/2;
		return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
	}

	public double getPerimeter() {
		return s1 + s2 + s3;
	}
	
	public String toString(){
		return super.toString() + "\n" + "面积" + getArea() +"\n" + "周长" + getPerimeter();
	}
}

public class Test{
	public static void main(String[] args){
		GeometricObject t = new Triangle(3,4,5,"black",true);
		System.out.println(t.toString());
		
	}
}


public abstract class GeometricObject{
	public abstract double getArea();
	public abstract double getPerimeter();
}



*/















package platform;


public class Triangle extends GeometricObject{
	private double a = 3, b = 4, c = 5;
	
	public Triangle(){
		
	}
	
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}
	
	public void setA(double a){
		this.a = a;
	}

	
/*
	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea(){
		double p = (side1 + side2 + side3)/2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}
	*/
//	public String toString(){
//		return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
//	}

	public double getPerimeter() {
		return a + b + c;
	}
	
	public String toString(){
		return "三角形的三条边是"+ a + " " + b + " " + c + "\n";
	}

	
	
}

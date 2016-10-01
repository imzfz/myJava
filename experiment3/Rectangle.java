package experiment3;

public class Rectangle extends Calculation{		//矩形类继承Calculation类
	private double width=1,height=1;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width,double height){		//输入矩形边长
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){		//计算面积
		return width * height;
	}
	
	public double getPerimeter(){		//计算体积
		return 2 * (height + width);
	}
	
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("宽度:" + r1.width + "\n");
		System.out.println("高度:" + r1.height + "\n");
		System.out.println("宽度:" + r1.getPerimeter() + "\n");
		System.out.println("宽度:" + r1.getArea() + "\n");
		System.out.println("宽度:" + r2.width + "\n");
		System.out.println("高度:" + r2.height + "\n");
		System.out.println("宽度:" + r2.getPerimeter() + "\n");
		System.out.println("宽度:" + r2.getArea() + "\n");
	}
}

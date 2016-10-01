package experiment3;

public class TestCal {
	public static void main(String[] args){			//测试类使用抽象类新建对象
		Calculation c1 = new Circle(5);				//圆对象
		Calculation c2 = new Rectangle(3,3);		//矩形对象
		Calculation c3 = new Triangle(3,4,6);		//三角形对象
		
		System.out.println(c1.getArea());			//输出面积和体积
		System.out.println(c1.getPerimeter());
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		System.out.println(c3.getArea());
		System.out.println(c3.getPerimeter());
	}
}

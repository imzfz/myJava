package experiment2;

public class TestPoint {

	public static void main(String[] args) {
	//	double x1,y1;
	//	double d;
		Point p1 = new Point();
		Point p2 = new Point();
		p1.setX(2);
		p1.setY(3);
		p2.setX(4);
		p2.setY(5);
		
		System.out.println("(2,3)和(10,30)间的距离是" + p1.getDistance(10, 30));
		System.out.println("(4,5)和(20,50)间的距离是" + p2.getDistance(20, 50));

	}

}

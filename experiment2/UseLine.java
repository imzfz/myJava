package experiment2;

public class UseLine {

	public static void main(String[] args) {
		LinePoint p1 = new LinePoint(3,4);		//创建点实例
		LinePoint p2 = new LinePoint(9,10);
		Line l1 = new Line(p1,p2);		//传入点进行计算
		Line l2 = new Line(10,20,30,40);		//直接传入坐标进行计算
		
		System.out.println("线段的长度为" + l2.distance());
		System.out.println("线段的长度为" + l1.distance());
		
	}

}

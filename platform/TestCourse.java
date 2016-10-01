package platform;

public class TestCourse {
		public static void main(String[] args){
			tCourse c = new tCourse("面向对象技术");
			c.addStudents("张三");
			c.addStudents("李四");
			c.addStudents("王五");
			System.out.println(c.toString());
		}
	}

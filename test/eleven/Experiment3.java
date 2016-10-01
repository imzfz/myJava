package test.eleven;

import experiment3.*;

public class Experiment3 {
	public static void main(String[] args){		//创建学生地址，老师地址，学生分数对象，输出显示
		Address StAd = new Address("China", "Chaoyang", "Beijing", "5");
		Address TcAd = new Address("China", "Haidian", "Beijing", "6");
		Student st = new Student("zhang", 'M', StAd, "666");
		Teacher tec = new Teacher("TCwang", 'F', TcAd, 888);
		
		tec.setStudentGrade(st, 88);
		System.out.println(tec.toString());
		System.out.println(st.toString());
		
	}
}

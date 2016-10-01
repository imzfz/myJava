package demo;
import experiment2.*;

public class TestVehicle {
	public static void main(String[] args){
		Vehicle sp =new Vehicle(100);
		sp.speedDown(5);
		sp.speedUp(10);
		System.out.println("车辆的速度是" + sp.getSpeed());
	}
}

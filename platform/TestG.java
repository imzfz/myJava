package platform;

public class TestG {
	public static void main(String[] args){
		GeometricObject[] object = {new Circle(),new Circle(20),new Triangle(),new Triangle(10,20,15)};
		double total=0;
		
		
		for(GeometricObject go:object){
			total += go.getPerimeter();
		}
		
		System.out.println("The total perimeter is " + total);
		
		for(GeometricObject go:object){
			System.out.println(go.toString());
		}
		
		java.util.Arrays.sort(object);

	    
	    for(int i = 0; i <object.length; i++){
	    	System.out.println("The " + i + "th short perimeter is " + object[i].getPerimeter());
	   	}
		
		
	}
}

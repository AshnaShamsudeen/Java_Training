package inheritance;

public abstract class Car {
	
	
	 private String model;//it can be default ,public,protected but not private
	 private String color;
	 private String regNo;
	
public Car() {
	System.out.println("constructor started");
}
	
	public Car(String model, String color, String regNo) {
		
		this.model = model;
		this.color = color;
		this.regNo = regNo;
	}

	public void start() {
		System.out.println("car started");
	}
	
	public abstract void brake() ;//{
		//System.out.println("car stopped");
	//}
	
	public void showCarInfo() {
		System.out.println("Model: "+model);
		System.out.println("color: "+color);
		System.out.println("Red No: "+regNo);
	}
	static void stop()
	{ 
		System.out.println("car stopped");
	}

}




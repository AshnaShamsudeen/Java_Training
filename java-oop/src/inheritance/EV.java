package inheritance;

public class EV extends Car{
	double batteryCapacityAH;

	public EV(String model,String regNo,String color,double batteryCapacityAH) {
		super(model,regNo,color);
	this.batteryCapacityAH=batteryCapacityAH;
	}
	public void chargeBattery()
	{
		System.out.println("charging battery");
	}
	public void start()
	{   super.start(); 
		System.out.println("ev started");
	}
	public void brake() {}
	static void stop()
	{  
		System.out.println("ev stopped");
	}
	public void showCarInfo()
	{
		super.showCarInfo();
		System .out.println("batteryCapacityAH" +batteryCapacityAH);
	}
}

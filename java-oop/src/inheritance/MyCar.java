package inheritance;

public class MyCar {

	public static void main(String[] args) {
		EV myCar=new EV("BMW","RED","kl3445665",77.9);
		
		//FuelEngine myCar= new FuelEngine();
		//EV myCar = new EV();
		//Car myCar= new EV();
		
		//FuelEngine.myCar=(FuelEngine) new Car();
		//myCar.refillFuel();
		
		myCar.start();
		
		myCar.showCarInfo();
		myCar.stop();
		//myCar.batteryCapacityAH=500;
		//myCar.chargeBattery();

	}

}

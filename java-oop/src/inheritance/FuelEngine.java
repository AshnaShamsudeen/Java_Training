package inheritance;

public class FuelEngine extends Car {
	double engine_cc;
	public void refillFuel() {
		System.out.println("Fuel refill is done");
	}
	public void brake() {}
	public void showCarInfo()
	{
		super.showCarInfo();
		System.out.println("Fuel refill is done"+engine_cc);
	}

}

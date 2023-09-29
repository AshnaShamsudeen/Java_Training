package encapsulation;

public class Car {
	private String model;
	private String color;
	private String regNo;
	
	
		public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



		public Car(String model, String color, String regNo) {
		super();
		this.model = model;
		this.color = color;
		this.regNo = regNo;
	}



		public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getRegNo() {
		return regNo;
	}



		public void setRegNo(String regNo) {
			this.regNo=regNo;
		}
		
	
	
	public void start() {
		System.out.println("car started");
	}
	public void showCarInfo() {
		System.out.println("Model: "+model);
		System.out.println("color: "+color);
		System.out.println("Red No: "+regNo);
	}

}

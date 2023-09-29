class Car{
    static int noOfWheels;
	String reg_no;
	String model;
	String color;
    public Car(){
        System.out.println("brake created");

    }
    public Car(String regNo,String model1,String color1){
        reg_no=regNo;
        model=model1;
        color=color1;
    }

	public void printCarDetails(){
	System.out.println("registration number: "+reg_no);

	System.out.println("model: "+model);

	System.out.println("COLOR: "+color);
    System.out.println("no. of wheels: "+noOfWheels);}

    public void start(){
	System.out.println("car started");}
    public void brake(){
	System.out.println("brake applied");}




}

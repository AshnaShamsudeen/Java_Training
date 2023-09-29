class CarMain{
    public static void main (String[]args){
    Car tata =new Car();
    System.out.println("For TATA CAR");
    tata.reg_no="KL05A2023";
    tata.model="tata Nexon";
    tata.color="red";
    tata.noOfWheels=6;
    tata.start();
    tata.brake();
    tata.printCarDetails();

    Car bmw =new Car();
    System.out.println("For BMW CAR");
    bmw.reg_no="KL05A12023";
    bmw.model="BMW x1";
    bmw.color="black";
    tata.noOfWheels=4;
    bmw.start();
    bmw.brake();
  
    bmw.printCarDetails();}}

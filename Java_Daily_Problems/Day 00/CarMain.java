class CarMain{
    public static void main (String[]args){
    Car.noOfWheels=6;
    System.out.println("For TATA CAR");
    Car tata=new Car("KL05A2023","tata Nexon","red");
    System.out.println("For BMW CAR");
    Car bmw=new Car("KL05A12023","BMW x1","black");
    tata.start();
    tata.brake();
    tata.printCarDetails();
    bmw.start();
    bmw.brake();
    bmw.printCarDetails();}}

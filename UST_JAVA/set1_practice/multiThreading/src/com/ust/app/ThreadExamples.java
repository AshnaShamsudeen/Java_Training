package com.ust.app;

class Multiplier{
	public static synchronized void multiplyAndPrint(int n) {
		for(int i=0;i<=10;i++)
			System.out.println(n+ "x"+i+"= "+(n*i));
	}
	
}
class MyThread1 extends Thread {
public void run() {
	Multiplier.multiplyAndPrint(5);}

//		for(int i=10;i<=20;i++) {
//			System.out.println("Ftrom Thread1: i= "+i);
//			try {
//				sleep(1000);
//			}
//			catch(Exception e) {
//				
//			}
//		}
//	}

}
class MyThread2 implements Runnable {
	public void run() {
		Multiplier.multiplyAndPrint(10);
		
//		for(int i=110;i<=120;i++) {
//			System.out.println("Ftrom Thread2: i= "+i);
//			try {
//				sleep(1000);
//			}
//			catch(Exception e) {
//				
//			}
//		}
	}

}
public class ThreadExamples {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		Runnable r1=()->Multiplier.multiplyAndPrint(10);
		//MyThread2 mt=new MyThread2();
		//Runnable r1=new MyThread2();
		Thread t2= new Thread(r1);
		t1.start();
		t2.start();
	}
}

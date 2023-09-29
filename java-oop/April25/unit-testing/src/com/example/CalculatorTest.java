package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	Calculator calc;
	@BeforeEach
	public void init() {
		System.out.println("Init Test");
		calc=new Calculator();
	}
	@AfterEach
	public void tearDown() {
		System.out.println("Test Complete");
		calc=null;
	}
	
	@Test
	public void testAdd() {
		//given
		
		int x=10,y=20;
		
		//when
		int result=calc.add(10, 20);
		
		//then
		assertEquals(30,result);
	}
	
	@Test
	public void testFindLargest() {
	//given
		//Calculator c1=new Calculator();
		int x=10,y=20;
		
		/*//when
		int result=c1.findLargest(10, 20);
		
		//then
		assertEquals(20,result);*/
		
		assertEquals(100,calc.findLargest(100, 30));
		assertEquals(40,calc.findLargest(10, 40));
		assertEquals(-10,calc.findLargest(-10, -30));}
	
	@Test
	public void testDivide() {
		//given
			//Calculator calc=new Calculator();
			//int x=20,y=10;
			assertEquals(10,calc.divide(100, 10));
			assertEquals(2,calc.divide(20, 10));
			assertEquals(2,calc.divide(10, 5));
			assertThrows(ArithmeticException.class,()->calc.divide(10, 0));
		
		
		
		
		
		
		
		

}}

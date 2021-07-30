package com.mph.mvnproj;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;


public class CalculateTest {
	
	Calculate calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("@Before Class Called");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("@AfterClass Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Add Test");
		//assertEquals(130, calc.add(10,20,100));
		assertNotEquals(130, calc.add(10,20,100));
		
		
	}
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		assertNotEquals(130, calc.add(10,2,10));
	}
	
	@Test
	public void testDivide()
	{
		System.out.println("Divide Test");
		calc.divide();
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Rule says Do Not Divide by ZERO");
	}
	
	@Rule
	ExpectedException exception = ExpectedException.none();

}





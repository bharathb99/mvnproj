package com.mph.mvnproj;

public class Calculate {

	public int add(int... number)
	{
		int result=0;
		
		for(int i: number)
		{
			result =result+i;
		}
		
		return result;
	}
	
	public int multiply()
	{
		return 1;
	}
	
	
	public int divide()throws ArithmeticException
    {
        int result=1/3;
        return result;
    }
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		

	}

}
























//package com.mph.mvnproj;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//
//
//public class CalculateTest {
//	
//	Calculate calc;
//	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception{
//		
//		System.out.println("@Before Class Called");
//	}
//	
//	@AfterClass
//	public static void tearDownAfterClass() throws java.lang.Exception
//	{
//		System.out.println("@AfterClass Called");
//	}
//	
//	@Before
//	public void setUp() throws java.lang.Exception
//	{
//		System.out.println("@Before Called");
//		calc = new Calculate();
//	}
//	
//	@After
//	public void tearDown() throws java.lang.Exception
//	{
//		calc=null;
//		System.out.println("@After Called");
//	}
//	
//	@Test
//	public void testAdd()
//	{
//		System.out.println("Add Test");
//		assertNotEquals(140, calc.add(10,20,100));
//		
//	}
//	@Test
//	public void testMultiply()
//	{
//		System.out.println("Multiply Test");
//	}
//
//	@Test 
//	public void testDivide()
//	{
//		System.out.println("Divide Test");
//		calc.divide();
//	}
//	
//	@Rule
//	public ExpectedException exception = ExpectedException.none();
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.mph.mvnproj;
////
////public class Calculate {
////
////	public int add(int... number)
////	{
////		int result=0;
////		
////		for(int i: number)
////		{
////			result =result+i;
////		}
////		
////		return result;
////	}
////	
////	public int multiply(int... number)
////	{
////		int result = 1;
////		for(int i: number)
////		{
////			result =result*i;
////		}
////		
////		return result;
////	}
////	
////	@Test 
////	public void testDivide()
////	{
////		System.out.println("Divide Test");
////		calc.divide();
////	}
////	
////	@Rule
////	public ExpectedException exception = ExpectedException.none();
////	
////	public static void main(String[] args) {
////		Calculate c = new Calculate();
////		System.out.println(c.add(10,10));
////		System.out.println(c.add(10,10,10));
////		System.out.println(c.add(10,10,20,30));
////
////	}
////
////}
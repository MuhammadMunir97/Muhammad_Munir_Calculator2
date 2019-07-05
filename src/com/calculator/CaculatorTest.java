package com.calculator;

public class CaculatorTest {

	public static void main(String[] args) {
		
		DataInput data = new DataInput();
		PerformCalculation method = new simplePrecedence();
		data.setOrderOfPrecedence(method);
		
		data.performOperation(20.0);
		data.performOperation("/");
		data.performOperation(10.0);
		data.performOperation("/");
		data.performOperation(2.0);
		data.performOperation("/");
		data.performOperation(2.0);
		data.performOperation("*");
		data.performOperation(5.0);
		data.performOperation("+");
		data.performOperation(3.0);
		data.performOperation("=");
		
	}
	

}

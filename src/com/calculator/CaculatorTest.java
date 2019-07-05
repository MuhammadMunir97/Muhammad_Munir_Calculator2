package com.calculator;

public class CaculatorTest {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
		myCalculator.setOperandOne(12.5);
		myCalculator.setOperation('+');
		myCalculator.setOperandTwo(20.5);
		System.out.println(myCalculator.getResults());
	}

}

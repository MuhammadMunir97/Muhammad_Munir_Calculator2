package com.calculator;

import java.util.ArrayList;

public class DataInput implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> operators = new ArrayList<>();
	ArrayList<Double> operands = new ArrayList<>();
	PerformCalculation method;
	
	public void setOrderOfPrecedence(PerformCalculation method) {
		this.method = method;
	}
	public void performOperation (String operand) {
		if (operand == "=") {
			System.out.println("Result is: " + method.calculating(operators, operands));
		}else {
			this.operators.add(operand);
		}
	}
	public void performOperation (Double operand) {
		this.operands.add(operand);
	}
}

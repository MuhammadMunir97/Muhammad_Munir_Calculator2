package com.calculator;

import java.util.ArrayList;

public interface PerformCalculation {
	public Double calculating(ArrayList<String> operators, ArrayList<Double> operands);
}

class simplePrecedence implements PerformCalculation, java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	// this gives precedence to dmas rule and first from right.
	// you can have your own precedence and implement that instead of this if you want to as the interface will allow for that.
	
	
	Operation operation;
	@Override
	public Double calculating(ArrayList<String> operators, ArrayList<Double> operands) {
		operation = new divide();
		calculation(operators, operands, '/');
		operation = new multiply();
		calculation(operators, operands, '*');
		operation = new plus();
		calculation(operators, operands, '+');
		operation = new subtract();
		calculation(operators, operands, '-');
		
		return operands.get(0);
	}
	public void calculation(ArrayList<String> operators, ArrayList<Double> operands, char operator) {
		for (int index = performPrecedence(operator, operators); index != -1; index=performPrecedence(operator, operators)) {		
			operands.set(index , operation.getResults(operands.get(index), operands.get(index + 1))); 
			operands.remove(index + 1);
		//  add the following line to see behind the scene process taking place 
		//	System.out.println("current operator are: " + operators + " , operation: " + operator + " current operand is: " + operands.get(index) + "  the rest of operands are: " + operands);
		}
	}
	
	public int performPrecedence(char operator, ArrayList<String> operators) {
		for (int i = (operators.size() - 1); i >= 0; i--) {
			if (operator == operators.get(i).charAt(0)) {
				operators.remove(i);
				return i;
			}
		}
		return -1;
	}
	
}
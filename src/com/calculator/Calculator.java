package com.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Calculator implements PerformCalculation{


	// this gives precedence to dmas rule and first from right.
	// you can have your own precedence and implement that instead of this if you want to as the interface will allow for that.
	
	
	Operation operation;
	Map<String, Operation> possibleOperation = new HashMap<>();
	
	
	public void calculation(ArrayList<String> operators, ArrayList<Double> operands, String operator) {
		try {
		operation = possibleOperation.get(operator);
		}catch(Exception e){
			System.out.println("invalid operator entered please try again");
		}
		for (int index = getIndexOfOperator(operator, operators); index != -1; index=getIndexOfOperator(operator, operators)) {		
			operands.set(index , operation.getResults(operands.get(index), operands.get(index + 1))); 
			operands.remove(index + 1);
		//  add the following line to see behind the scene process taking place 
		//	System.out.println("current operator are: " + operators + " , operation: " + operator + " current operand is: " + operands.get(index) + "  the rest of operands are: " + operands);
		}
	}
	
	public int getIndexOfOperator(String operator, ArrayList<String> operators) {
		for (int i = (operators.size() - 1); i >= 0; i--) {
			if (operator == operators.get(i)) {
				operators.remove(i);
				return i;
			}
		}
		return -1;
	}
}

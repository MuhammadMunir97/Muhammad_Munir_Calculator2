package com.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Calculator implements PerformCalculation{


	// this gives precedence to dmas rule and first from right.
	// you can have your own precedence and implement that instead of this if you want to as the interface will allow for that.
	
	
	Operation operation;
	Map<String, Operation> possibleOperation = new HashMap<>();
	CalculatorSetup setup;
	
	public void settingUp(CalculatorSetup newSetup) {
		setup = newSetup;
		setup.calculatorSetup(possibleOperation);
	}
	
	
	public void calculation(ArrayList<String> operators, ArrayList<Double> operands, String operator) {
		try {
		operation = possibleOperation.get(operator);
		}catch(Exception e){
			System.out.println("invalid operator entered please try again");
		}
		for (int index = (operators.size() - 1); index > -1; index--) {		
			if (operator == operators.get(index)) {
			operands.set(index , operation.getResults(operands.get(index), operands.get(index + 1))); 
			operands.remove(index + 1);
			operators.remove(index);
		//  add the following line to see behind the scene process taking place 
		//	System.out.println("current operator are: " + operators + " , operation: " + operator + " current operand is: " + operands.get(index) + "  the rest of operands are: " + operands);
			}
		}
			
	}
	
	
	
	
	
}

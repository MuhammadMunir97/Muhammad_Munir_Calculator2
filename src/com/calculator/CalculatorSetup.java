package com.calculator;

import java.util.Map;

public interface CalculatorSetup {
	public void calculatorSetup(Map<String, Operation> possibleOperation);
}

class normalSetup implements CalculatorSetup{

	@Override
	public void calculatorSetup(Map<String, Operation> possibleOperation) {
		possibleOperation.put("/", new divide());
		possibleOperation.put("*", new multiply());
		possibleOperation.put("+", new plus());
		possibleOperation.put("-", new subtract());
		
	}
	
}
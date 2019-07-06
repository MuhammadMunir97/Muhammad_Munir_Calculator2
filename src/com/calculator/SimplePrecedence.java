package com.calculator;

import java.util.ArrayList;

public class SimplePrecedence extends Calculator{

	public void calculatorSetup() {
		// setting up your calculator with all the possible hash values
		
		this.possibleOperation.put("/", new divide());
		this.possibleOperation.put("*", new multiply());
		this.possibleOperation.put("+", new plus());
		this.possibleOperation.put("-", new subtract());
	}
	@Override
	public Double calculating(ArrayList<String> operators, ArrayList<Double> operands) {
		calculatorSetup();
		// precedence for your calculator
		calculation(operators, operands, "/");
		calculation(operators, operands, "*");
		calculation(operators, operands, "+");
		calculation(operators, operands, "-");
		
		return operands.get(0);
	}

}

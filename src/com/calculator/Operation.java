package com.calculator;

public interface Operation {
	public double getResults(double operandOne, double operandTwo);
}

class plus implements Operation{

	@Override
	public double getResults(double operandOne, double operandTwo) {
		return operandOne + operandTwo;
	}
	
}
class subtract implements Operation{

	@Override
	public double getResults(double operandOne, double operandTwo) {
		return operandOne - operandTwo;
	}
	
}
class multiply implements Operation{

	@Override
	public double getResults(double operandOne, double operandTwo) {
		return operandOne * operandTwo;
	}
	
}
class divide implements Operation{

	@Override
	public double getResults(double operandOne, double operandTwo) {
		return operandOne / operandTwo;
	}
	
}

package com.calculator;

public interface Operation {
	public Double getResults(Double operandOne, Double operandTwo);
}

class plus implements Operation{

	@Override
	public Double getResults(Double operandOne, Double operandTwo) {
		return operandOne + operandTwo;
	}
	
}
class subtract implements Operation{

	@Override
	public Double getResults(Double operandOne, Double operandTwo) {
		return operandOne - operandTwo;
	}
	
}
class multiply implements Operation{

	@Override
	public Double getResults(Double operandOne, Double operandTwo) {
		return operandOne * operandTwo;
	}
	
}
class divide implements Operation{

	@Override
	public Double getResults(Double operandOne, Double operandTwo) {
		return operandTwo / operandOne;
	}
	
}

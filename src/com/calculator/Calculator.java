package com.calculator;





public class Calculator implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private Operation operation;
	
	Calculator(){
		
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public void setOperation(char operation) {
		switch(operation) {
		case '+':
			this.operation = new plus();
			break;
		case '-':
			this.operation = new subtract();
			break;
		case '*':
			this.operation = new multiply();
			break;
		case '/':
			this.operation = new divide();
			break;
		default:
			System.out.println("this operand does not exist");	
		}
		
	}
	
	
	public double getResults() {
		return this.operation.getResults(operandOne, operandTwo);
		}
	
}

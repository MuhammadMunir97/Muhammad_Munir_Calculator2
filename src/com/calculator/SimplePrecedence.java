package com.calculator;

import java.util.ArrayList;

public class SimplePrecedence extends Calculator {

	
	@Override
	public Double calculating(ArrayList<String> operators, ArrayList<Double> operands) {
		//this.settingUp(new normalSetup());
		// precedence for your calculator
		calculation(operators, operands, "/");
		calculation(operators, operands, "*");
		calculation(operators, operands, "+");
		calculation(operators, operands, "-");
		
		return operands.get(0);
	}

}

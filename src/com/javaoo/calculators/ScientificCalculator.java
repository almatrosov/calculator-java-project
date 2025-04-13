package com.javaoo.calculators;

public class ScientificCalculator {
	
	public static final double PI = 3.14159;
	private double holdValue;
	
	public final double exp(double x) {
		return(Math.exp(x));
	}
	
	public final double log(double x) {
		return(Math.log(x));
	}
	
	public final void putValueInMemory(double x) {
		holdValue = x;
	}
	
	public final double sqrt(double x) {
	    return Math.sqrt(x);
	}
	
	public final double getValueFromMemory() {
		return(holdValue);
	}

}

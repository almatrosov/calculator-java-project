package com.javaoo.calculators;

public class CalculatorDriver {

	public static void main(String[] args) {

		BasicCalculator bc = new BasicCalculator();
		System.out.println("7 + 5 = " + bc.add(7, 5));
		System.out.println("7 - 5 = " + bc.subtract(7, 5));
		System.out.println("7 * 5 = " + bc.multiply(7, 5));
		System.out.println("7 / 5 = " + bc.divide(7, 5));
		
		ScientificCalculator sc = new ScientificCalculator();
		System.out.println("Exponent of 20 = " + sc.exp(20));
		System.out.println("Logarithm of 100 = " + sc.log(100));
		sc.putValueInMemory(23.5);
		System.out.println("Value in memory is " + sc.getValueFromMemory());
		
		TrigonometricCalculator tc = new TrigonometricCalculator();
		System.out.println("Sine of .523 is " + tc.sine(.523));
		System.out.println("Cosine of .523 is " + tc.cosine(.523));
		System.out.println("Tangent of .523 is " + tc.tangent(.523));
		System.out.println("Arcsine of .5 is " + tc.arcsine(.5));
		System.out.println("Arccosine of .5 is " + tc.arccosine(.5));
		System.out.println("Arctangent of .5 is " + tc.arctangent(.5));

	}

}

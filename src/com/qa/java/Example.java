package com.qa.java;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;

		result = add(10, 10);

		System.out.println(result);

		int multi;

		multi = multiplication(10, 10);

		System.out.println(multi);

		int sub;

		sub = subtraction(10, 10);

		System.out.println(sub);

		double div;

		div = division(10.5d, 2.5d);

		System.out.println(div);

	}

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int multiplication(int x, int y) {

		return x * y;
	}

	public static int subtraction(int w, int z) {

		return w - z;
	}

	public static double division(double a, double b) {

		return a / b;
	}

}

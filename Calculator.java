package com.java.TrainingSession.Polymorphism;

public class Calculator {
	public int Add(int num1, int num2) {
		return num1 + num2;
	}
	public double Add(double num1, double num2) {
		return num1 + num2;
	}
	public double Add(double num1, int num2) {
		return (double)num1 + num2;
	}
}

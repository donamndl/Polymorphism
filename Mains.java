package com.java.TrainingSession.Polymorphism;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.Add(7, 3));
		System.out.println(cal.Add(5.2, 3));
		System.out.println(cal.Add(7.6, 3.4));
		
		Square s = new Square();
		System.out.println(s.Area(3));
	}

}

package me.ankit.Lambda.LambdaExpression;

import me.ankit.Lambda.OOP.Greeting;

public class LambdaTest {

	public static void main(String[] args) {

		Greeting lambdaExpression = () -> System.out.println("Hello World!!! Lambda");
		
		lambdaExpression.perform();
	
	}

}


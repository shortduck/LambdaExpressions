package me.ankit.Lambda.OOP;

public class Greeter {

	public void Greet(Greeting greet) {
		
		greet.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		greeter.Greet(new HelloWorldGreeting());
	

	}

}

package com.main.lambda;

interface m1 {
	public void show();
}

class Demo implements m1{

	@Override
	public void show() {
		System.out.println("Hello");
		
	}
	
} 

public class FunctionalInterface {

	public static void main(String[] args) {
		Demo d =   new Demo();
		d.show();

	}

}

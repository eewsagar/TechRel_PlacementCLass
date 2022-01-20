package com.main.lambda;

interface m11 {
	public void show();
}

class Demo1 implements m11{

	@Override
	public void show() {
		System.out.println("Hello");
		
	}
	
} 

public class FunctionalInterface2 {

	public static void main(String[] args) {
		m11 m =   new Demo1();
		m.show();

	}

}


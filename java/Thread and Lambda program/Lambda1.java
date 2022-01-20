package com.main.lambda;


interface m2 {
	public void show();
}


public class Lambda1 {

	public static void main(String[] args) {
		m2 m =   new m2() {
			public void show() {
				System.out.println("Hello");
				
			}
		};
		m.show();

	}

}

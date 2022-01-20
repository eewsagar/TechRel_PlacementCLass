package com.main.lambda;


interface m3 {
	public void show(int a);
	static void fun1() {};
	static void fun2() {};
	static void fun3() {};
	static void fun() {};
	
}

public class Lambda2 {

	public static void main(String[] args) {
		m3 m = (a) ->{
			for(int i=1; i<10;i++) {
			System.out.println(" "+(i*a));
			}
		};
		m.show(5);

	}

}

// code concises
// it reduce code 
//increase code readablity
// enable functional programming

package com.main.thread;

// implement runnable interface
// extends Thread class

class Task1 extends Thread{
	public void run() {
		for(int i=1; i<100;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 1 done ");
	}
}

class Task2 implements Runnable{
	public void run() {
		for(int i=100; i<200;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 2 done ");
	}
}

class Task3 extends Thread{
	public void run() {
		for(int i=200; i<300;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 3 done ");
	}
}


public class ThreadNormalForLoop2 {
	public static void main(String[] args) {
		
		//Task1
		Task1 t1 =  new Task1();
		t1.start();
		
		//Task2
		Task2 t2 =  new Task2();
		Thread th = new Thread(t2);
		th.start();
		
		//Task3
		Task3 t3 =  new Task3();
		t3.start();
		
		System.out.println("\nAll Task  done ");
		
		
	}	

}

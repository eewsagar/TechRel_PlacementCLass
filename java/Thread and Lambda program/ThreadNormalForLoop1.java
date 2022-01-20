package com.main.thread;

// implement runnable interface
// extends Thread class

class Task extends Thread{
	public void run() {
		for(int i=1; i<100;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 1 done ");
	}
}


public class ThreadNormalForLoop1 {
	public static void main(String[] args) {
		Task t1 =  new Task();
		t1.start();
		
		for(int i=100; i<200;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 2 done ");
		
		for(int i=200; i<300;i++) {
				System.out.print(" "+i);
		}
		System.out.println("\nTask 3 done ");
		
		System.out.println("\nAll Task  done ");
		
		
	}	

}

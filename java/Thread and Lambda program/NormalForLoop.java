package com.main.thread;
// normal 
public class NormalForLoop {
	public static void main(String[] args) {
		for(int i=1; i<100;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nTask 1 done ");
		
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

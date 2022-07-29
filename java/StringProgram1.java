/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.Scanner;

/**
 *
 * @author sagarverma
 */
//6) How to reverse a given String? (solution)
//Write a program to reverse a String in C/Java/Python or choice of your programming language. 
//You can write either the recursive or iterative solution. 
//For example, if a given input is "abcd," then your function should return "dcba".
//String s = "abcdc";  a=0, b=1, c=2, d=3;


public class StringProgram1 {
    public void reverseString(String Str){
        int lenght =  Str.length();
        System.out.println("String after reverse: ");
        for(int i= (lenght-1 ); i>=0;i--){
         System.out.print(""+Str.charAt(i));
    
    }
    }
    
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Please enter the string to reverse it: ");
        String input =  sc.nextLine();
        StringProgram1 sp =  new StringProgram1();
        sp.reverseString(input);
    }
    
}

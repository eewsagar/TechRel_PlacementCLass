/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Sagar Varma
 *
 * Created on March 1, 2021, 10:51 AM
 */
#include <iostream>
#include <cmath>
#include <fstream>
using namespace std;

//1)febonanci series
//2) armstrong number
//3) reverse of string

class febonacci {
public:
    int t1 = 0, t2 = 1, nextTerm = 0, n;

    febonacci() {
        cout << "Enter a positive number: ";
        cin >> n;

        // displays the first two terms which is always 0 and 1
        cout << "Fibonacci Series: " << t1 << ", " << t2 << ", ";

        nextTerm = t1 + t2;

        while (nextTerm <= n) {
            cout << nextTerm << ", ";
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
    }
};

void reverseString() {  // function
    string s;
    cout << "\n***** Reverse String *****\nEnter a String : ";
    cin >> s;
    for (int i = s.length() - 1; i >= 0; i--)// revers the string
        cout << s[i];
}

class amrstrongNumber {
public:
    int num, originalNum, remainder, n = 0, result = 0, power;

    void armstrongNumberFind() { // return type i.e why method
        cout << "\n**** Is armstrongNumber or not?? ****\n Enter an integer: ";
        cin >> num;
//        153
        originalNum = num;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }
//        n=3
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;

            // pow() returns a double value
            // round() returns the equivalent int
            power = round(pow(remainder, n));
            result += power; 
            cout <<"\nresult : " << result;
            originalNum /= 10;
        }

        if (result == num)
            cout << "\n" << num << " is an Armstrong number.";
        else
            cout << "\n" << num << "is not an Armstrong number.";

    }

};

//int main() {
////    febonacci feb;
////
////    amrstrongNumber amrstro;
////    amrstro.armstrongNumberFind();
//    
//    reverseString();
//    return 0;
//
//}
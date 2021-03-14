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

//6)check leap year
//7) find factorial
//8) check charcter is vowel or constant

void checkLeapYear() { // function
    int year;

    cout << "\n****** LEAP YEAR *****\n\nEnter a year: ";
    cin >> year;

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                cout << year << " is a leap year.";
            else
                cout << year << " is not a leap year.";
        } else
            cout << year << " is a leap year.";
    } else
        cout << year << " is not a leap year.";

}

void findFactorial() {

    int n;
    unsigned long long factorial = 1;

    cout << "\n****** Find Factorial  *****\n\nEnter a positive integer: ";
    cin >> n;

    if (n < 0)
        cout << "Error! Factorial of a negative number doesn't exist.";
    else {
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
            cout << "factorial : "<<factorial <<"\n";
        }
        cout << "Factorial of " << n << " = " << factorial;
    }

}
void alphabetCategory(){
     char c;
    int isLowercaseVowel, isUppercaseVowel;

    cout << "\n****** Find Alphabet Category  *****\n\nEnter an alphabet: ";
    cin >> c;

    // evaluates to 1 (true) if c is a lowercase vowel
    isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

    // evaluates to 1 (true) if c is an uppercase vowel
    isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

    // show error message if c is not an alphabet
    if (!isalpha(c))
      printf("Error! Non-alphabetic character.");
    else if (isLowercaseVowel || isUppercaseVowel)
        cout << c << " is a vowel.";
    else
        cout << c << " is a consonant.";
}
//int main() {
////    checkLeapYear();
////    findFactorial();
//    alphabetCategory();
//
//    return 0;
//
//}
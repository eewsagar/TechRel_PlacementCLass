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

//9)C Program to find sum of elements in a given array
//10) C program to find largest element in an array

void sum() {
    int arr[] = {12, 3, 4, 15}; // declaring array
    int n = sizeof (arr) / sizeof (arr[0]);
    int sum = 0; // initialize sum 
    cout << "\n *****sum of element ****\nElements of array : ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " , ";
    }
    // Iterate through all elements 
    // and add them to sum 
    for (int i = 0; i < n; i++) {
        sum += arr[i];
        cout << "\n" << sum;
    }
    cout << "\n Sum of given array is " << sum;
}

void largest() {
    int arr[] = {10, 324, 45, 90, 9808};
    int n = sizeof (arr) / sizeof (arr[0]);
    int i;
    cout << "\n *****largest of element ****\nElements of array : ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " , ";
    }
    // Initialize maximum element
    int max = arr[0];

    // Traverse array elements 
    // from second and compare
    // every element with current max 
    for (i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
            cout <<"max : " <<max <<" arr[i] : " <<arr[i] <<"\n";
        }
    }

    cout << "\n Largest in given array is :" << max;
}

//int main() {
//
////    sum();
//    largest();
//    return 0;
//
//}
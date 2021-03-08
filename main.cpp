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
#include <cstdlib>
#include <string>
#include <iostream>
#include <memory>
#include <cmath>
using namespace std;

/*using namespace std;

 * 
 * .Write a program in C++ tp print * patterns



 */
int main() {
    
    int num ;
    cout << " Please enter the length of  the star pattern    : ";
    cin >> num;
    
    for (int i=num;i > 0 ;i--){
       for (int j =i  ; j>0;j--){
           cout << j << " ";
       } 
       cout << "\n";
    }
       for (int i=0;i <num ;i++){
       for (int j =1  ; j<=i+1;j++){
           cout << j << " ";
       } 
       cout << "\n";
    }
   
   
    
    
    return 0; // it having a return type as  
}


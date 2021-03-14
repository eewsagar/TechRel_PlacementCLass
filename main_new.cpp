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
#include <iostream>  // cin cout
#include <cmath>     // cmath
#include <fstream>   // file read write
#include <cstring>   // string
using namespace std;

//13) C Program for Bubble Sort
//14) C Program to Check if a Given String is Palindrome

void palindrome(){
    char string1[20];
    int i, length;
    int flag = 0;
    
    cout << "\\***** palindrome **** \n\nEnter a string: "; 
    cin >> string1;
    
    length = strlen(string1);
    
    for(i=0;i < length ;i++){
        if(string1[i] != string1[length-i-1]){ // checing the charater at both the string is same or not
            flag = 1;
            break;
   }
}   
    if (flag) {
        cout << string1 << " is not a palindrome" << endl; 
    }    
    else {
        cout << string1 << " is a palindrome" << endl; 
    }
}

void bubbleSort(){
  int a[50],n,i,j,temp;
	cout<<"\n\n ******* BubbleSort ******\n Enter the size of array: ";
	cin>>n;
	cout<<"\n Enter the array elements: "; 
	
	for(i=0;i<n;++i){
            cout << i <<" : ";
		cin>>a[i];
	}	
        cout<<"\nArray before bubble sort:";
	for(i=0;i<n;++i)
		cout<<" "<<a[i];
        
	for(i=1;i<n;++i)    // main logic of bubble sort
	{
		for(j=0;j<(n-i);++j)
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
	}
	
	cout<<"\n\nArray after bubble sort:";
	for(i=0;i<n;++i)
		cout<<" "<<a[i];
		

}
int main() {
    
   palindrome();
//   bubbleSort();
////   int n;
//   cout << "Enter the number of elements: ";
//   cin >> n;
//   int arr[n];     //create an array with given number of elements
//   cout << "Enter elements:" << endl;
//   for(int i = 0; i<n; i++) {
//      cin >> arr[i];
//   }
//   cout << "Array before Sorting: ";
//   display(arr, n);
//   bubbleSort(arr, n);
//   cout << "Array after Sorting: ";
//   display(arr, n);
}
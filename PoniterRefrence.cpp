#include "PoniterRefrence.h"
#include <iostream>
#include <String>

using namespace std;



void simple(int input);  // declaration

int add(int a, int b);




int main(){  // execution block , sperated code block function  // started point or program

//reference -> save the address of data
int a =20;
simple(a);  // calling of funtion
a=30;
simple(a);
 int b =40;
 cout <<"value of add function : " <<add(a,b) ;
 int output =  add(a,b);

  cout <<"value of output : " <<output ;
  return  0;
}

void simple(int input){    // when we dont have to return a value void is used other wise , data type
int a =  input;
 int &b = a;
 cout << "value of a : "<< a << endl;
 cout << "address  of a : "<< b << endl;
 cout << "address  of a : "<< &a << endl;
 cout << "value  of b : "<< &b << endl;

 //pointer - >  data type which store the address of variable

 int* c = &a;
// value of (adresss of(adress of variable))
 cout << "value of c: "<< c << endl;
 cout << "address  of c: "<< &c << endl;
 cout << "value of *c : "<< *c << endl << "-------------------"<<endl;
 //cout << "value  of b : "<< &b << endl;

}


int add(int a, int b){
 int c = a+b;

cout <<  c << endl;
return c;
}

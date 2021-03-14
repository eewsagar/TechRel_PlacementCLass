///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///* 
// * File:   main.cpp
// * Author: Sagar Varma
// *
// * Created on March 1, 2021, 10:51 AM
// */
//#include <iostream>
//#include <cmath>
//#include <fstream>
//using namespace std;
//
//int main() { // this is predefine funtion C++
//    cout << "\n file read write program \n";
//
//        ofstream myfile("test.txt");
//        
//        myfile << "hello world, this is file function.\n";
//        myfile << "hello world, this is file function.\n";
//        
//        myfile.close();
//    
//    string filetext;
//    //    
//    ifstream readFile("Resume1.txt"); // reading a file
//    try {
//        if (!readFile) {
//            cout << "\n file not found \n";
//            throw (404);
//        } else {
//            while (getline(readFile, filetext)) {
//
//                cout << filetext << "\n";
//            }
//        }
//    } catch (int num) {
//        cout << "file not found !! " << num;
//    }
//
//    readFile.close();
//    return 0;
//
//}
//

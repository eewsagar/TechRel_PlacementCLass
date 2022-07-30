/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sagarverma
 */
public class StringDataAppend {

    public static void main(String[] args) {
        try {
            File f1 = new File("log1.txt");
            appendData(f1, "\n new hello world");

        } catch (Exception e) {
            System.out.println("error " + e);
        }

    }

    public static void appendData(File file, String data) {
        try {
           // System.out.println("data : " + data + file.getName() + file.getAbsolutePath());
            // bufferwriter used to write into file.

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.append(data);
            bw.close();
        } catch (IOException ex) {
            System.out.println("error :" + ex);
        }

    }

}

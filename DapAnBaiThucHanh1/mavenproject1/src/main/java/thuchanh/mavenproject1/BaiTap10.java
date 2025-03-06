/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap10 {
    public static void main(String[] args) {
        try {
            // file numbers.txt tu tao, moi so cach nhau bang dau cach
            File f = new File("D:\\NetBeansProjects\\Bai1\\app\\src\\main\\resources\\numbers.txt");             
            Scanner sc = new Scanner(f);
            String line = sc.nextLine();
            String[] chArr = line.split(" ");             
            int sum = 0;
            int max = 0;
            for (String ch : chArr) {
                int n = Integer.parseInt(ch);
                sum += n;
                if (n > max)
                    max = n;
            }
            double avg = (double) sum / chArr.length;
            System.out.printf("So lon nhat trong mang la: %d\n", max);
            System.out.printf("Trung binh trong mang la: %.2f\n", avg);
        } catch (FileNotFoundException ex) { // su dung try catch de bat loi khong tim thay file
            System.out.println("Khong tim thay file.");
        }
    }
}

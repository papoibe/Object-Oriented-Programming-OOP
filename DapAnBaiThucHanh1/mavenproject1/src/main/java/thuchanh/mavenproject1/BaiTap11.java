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
public class BaiTap11 {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\NetBeansProjects\\Bai1\\app\\src\\main\\resources\\SV-HS-CD.txt");
            Scanner sc = new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            String line;
            int count = 0, countSV = 0, countHS = 0, countCD = 0;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] arr = line.split(",");
                char c = arr[0].charAt(0);
                if (!Character.isDigit(c)) // HS khong co ID
                    countHS++;
                else
                    if (arr.length == 7) // SV co 7 fields
                        countSV++;
                    else
                        countCD++; // CD co 6 fields
                count++;
            }
            
            System.out.printf("So luong HS: %d\n", countHS);
            System.out.printf("So luong SV: %d\n", countSV);
            System.out.printf("So luong CD: %d\n", countCD);
            System.out.printf("Tong so luong: %d\n", count);
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        }
    }
}

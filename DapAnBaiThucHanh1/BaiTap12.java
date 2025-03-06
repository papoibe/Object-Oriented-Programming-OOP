/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap12 {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\NetBeansProjects\\Bai1\\app\\src\\main\\resources\\SinhVien.txt");
            Scanner sc = new Scanner(f);
            String line;
            
            int numCNTT = 0;
            int numQTKD = 0;
            
            ArrayList <String> cntt = new ArrayList<>();
            sc.nextLine();
            
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] arr = line.split(",");
                if (arr[4].toLowerCase().contains("quan tri kinh doanh"))
                    numQTKD++;
                else if (arr[4].toLowerCase().contains("cong nghe thong tin")) {
                    numCNTT++;
                    cntt.add(line);
                }
            }                  
            
            System.out.printf("So luong sinh vien khoa CNTT: %d\n", numCNTT);
            System.out.printf("So luong sinh vien khoa QTKD: %d\n", numQTKD);
                        
            PrintWriter writer = new PrintWriter("D:\\NetBeansProjects\\Bai1\\app\\src\\main\\resources\\SinhVienCNTT.txt");
            for (String sv : cntt) {
                writer.println(sv);
            }
            
            writer.close();
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file.");
        }
    }
}

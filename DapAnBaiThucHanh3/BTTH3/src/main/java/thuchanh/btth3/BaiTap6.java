/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap6 {
    public static void main(String[] args) {
        ArrayList<CongDan> dsCongDan = new ArrayList<>();
        try {
            File f = new File("D:\\NetBeansProjects\\Bai3\\app\\src\\main\\resources\\SV-HS-CD.txt");
            Scanner sc = new Scanner(f);  
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] info = line.split(",");
                CongDan cd = null;
                
                if (Character.isLetter(info[0].charAt(0))) // Hoc sinh
                    cd = new HocSinh(info[0], info[1], "", "Hoc sinh", 
                            0, 0, 0, 
                            Double.parseDouble(info[2]),
                            Double.parseDouble(info[3]),
                            Double.parseDouble(info[4]),
                            info[5]
                    );
                else if (info.length == 7) {
                    String[] date = info[3].split("-");                   
                    cd = new SinhVien(info[1] + " " + info[2], info[0], info[5], "Sinh vien",
                            Integer.parseInt(date[0]),
                            Integer.parseInt(date[1]),
                            Integer.parseInt(date[2]),
                            info[4],
                            info[6]
                    );
                } else {
                    String[] date = info[3].split("-");  
                    cd = new CongDan(info[1] + " " + info[2], info[0], info[4], info[5], 
                            Integer.parseInt(date[0]),
                            Integer.parseInt(date[1]),
                            Integer.parseInt(date[2]));
                }
                dsCongDan.add(cd);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        dsCongDan.forEach(cd -> System.out.println(cd));
    }
}

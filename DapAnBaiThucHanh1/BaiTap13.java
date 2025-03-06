/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap13 {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\DoiTuyenQuocGiaVN.txt");            
            Scanner sc = new Scanner(f);
            sc.nextLine();
            
            int countAge = 0, countPlayer = 0, countHN = 0;
            int countHV = 0, countTM = 0, countTD = 0, countTV = 0;
            String line;
            ArrayList <String> players = new ArrayList<>();
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                String[] arr = line.split(",");
                if (Integer.parseInt(arr[2]) < 20) {
                    countAge++;
                    players.add(line);
                }
                
                switch (arr[1].toLowerCase()) {
                    case "hau ve" -> countHV++;
                    case "tien ve" -> countTV++;
                    case "tien dao" -> countTD++;
                    case "thu mon" -> countTM++;
                }
                String ho = arr[0].split(" ")[0];
                if (arr[3].toLowerCase().contains("clb ha noi") && ho.toLowerCase().contains("nguyen"))
                    countHN++;
                countPlayer++;
            }
            System.out.printf("So luong cau thu: %d\n", countPlayer);
            System.out.printf("So luong cau thu co ao dau duoi 20: %d\n", countAge);
            System.out.printf("So luong cau thu cua CLB Ha Noi co ho la Nguyen: %d\n", countHN);
            System.out.printf("Hau ve: %d - ", countHV);
            System.out.printf("Tien ve: %d - ", countTV);
            System.out.printf("Tien dao: %d - ", countTD);
            System.out.printf("Thu mon: %d\n", countTM);
            
            System.out.println("\nDanh sach cac cau thu co so ao duoi 20:");
            for (String p : players) {
                System.out.println(p);
            }
            
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file.");
        }
    }
}
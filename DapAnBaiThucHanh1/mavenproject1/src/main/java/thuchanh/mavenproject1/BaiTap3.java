/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai1;

import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so thang: ");
        int t = sc.nextInt();
        
        // Normal switch
        switch(t) { 
            case 1:case 3:case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 4:case 6:case 9: case 11:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 2:
                System.out.println("Thang nay co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("Thang khong hop le");
        }
        
        // Rule switch
        switch(t) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Thang nay co 31 ngay");
            case 4, 6, 9, 11 -> System.out.println("Thang nay co 30 ngay");
            case 2 ->   System.out.println("Thang nay co 28 hoac 29 ngay");
            default -> System.out.println("Thang khong hop le");
        }
    }
}

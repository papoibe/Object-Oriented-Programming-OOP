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
public class BaiTap2 {
    public static void main(String[] args) { // Su dung Ctrl + Space cho goi y cua Java     
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        double banKinh = sc.nextDouble();
   
        double dienTich = Math.PI * Math.pow(banKinh, 2);
        double chuVi = 2 * Math.PI * banKinh;
        
        System.out.printf("Dien tich hinh tron: %08.2f\n", dienTich); // Su dung ky tu thay the so thuc
        System.out.printf("Chu vi hinh tron: %08.2f\n", chuVi); // Su dung ky tu thay the so thuc
    }
}

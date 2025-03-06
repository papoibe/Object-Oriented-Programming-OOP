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
public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ho cua ban: ");
        String ho = sc.nextLine();
        System.out.println("Hay nhap ten lot cua ban: ");
        String tenLot = sc.nextLine();
        System.out.println("Hay nhap ten cua ban: ");
        String ten = sc.nextLine();
        String hoTen = ho + " " + tenLot + " " + ten;
        System.out.printf("Xin chao, %s.\n", hoTen);
        
        int count = 0;
        char c;
        for (int i = 0; i < hoTen.length(); i++) { // length cua string la phuong thuc
            c = hoTen.charAt(i);
            
            if (Character.isUpperCase(c)) // su
                count++;
        }        
        System.out.printf("So ky tu viet hoa trong chuoi la: %d\n", count);
                
        StringBuilder builder = new StringBuilder(); // Su dung StringBuilder de tao email
        builder.append(ten.toLowerCase());
        builder.append(".");
        builder.append(ho.toLowerCase().charAt(0));
        String[] words = tenLot.split(" ");        
        for (String w : words) {
            c = w.toLowerCase().charAt(0);
            builder.append(c);
        }        
        builder.append("@ou.edu.vn");
        String email = builder.toString();
        System.out.printf("Email OU cua ban la: %s\n", email);
        email = email.replaceAll("ou.edu.vn", "gmail.com");
        System.out.printf("Email GMail cua ban la: %s\n", email);
    }
}

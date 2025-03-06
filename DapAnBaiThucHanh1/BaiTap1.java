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
public class BaiTap1 {
    public static void main(String[] args) { // Luu y vi tri cua cac dau ngoac
        Scanner sc = new Scanner(System.in); // Tap su dung Alt + Enter de xu ly cac loi, hoac import nhanh thu vien
        System.out.println("Hay nhap ten cua ban: ");
        String name = sc.nextLine(); // Tap xem cac warning
        System.out.println("Hay nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.printf("Xin chao %s, ban %d tuoi.\n", name, age); // Tap su dung printf
        
        // Neu dao nguoc thu tu nhap du lieu        
        System.out.println("Hay nhap tuoi cua ban: ");
        int age2 = sc.nextInt(); // khi nhap so int co su dung nut Enter vi vay ki tu sau do se la '\n'
        sc.nextLine(); // cach khac phuc: skip dong '\n'
        System.out.println("Hay nhap ten cua ban: ");
        String name2 = sc.nextLine(); // nextLine se vo tinh lay ky tu '\n'
        System.out.printf("Xin chao %s, ban %d tuoi.\n", name2, age2);
    }
}

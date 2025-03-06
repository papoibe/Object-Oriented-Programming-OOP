/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem thu nhat 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Nhap diem thu nhat 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        Diem a = new Diem(x1, y1);
        Diem b = new Diem(x2, y2);
        System.out.printf("Toa do cua diem A: %s\n", a.toString());
        System.out.printf("Toa do cua diem B: %s\n", b.toString());
        System.out.printf("Khoang cach giua A va B: %.2f", a.tinhKhoangCach(b));
    }
}

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
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem A: ");
        double x1 = sc.nextDouble(); // 1
        double y1 = sc.nextDouble(); // 2
        System.out.println("Nhap diem B: ");
        double x2 = sc.nextDouble(); // 5
        double y2 = sc.nextDouble(); // 6        
        Diem a = new Diem(x1, y1);
        Diem b = new Diem(x2, y2);
        DoanThang ab = new DoanThang(a, b);
        System.out.printf("Doan thang AB: %s\n", ab.toString());
        System.out.printf("Do dai cua AB: %.2f\n", ab.doDai());
        System.out.printf("Trung diem cua AB: %s\n", ab.trungDiem().toString());
        
        System.out.println("Nhap diem C: ");
        double x3 = sc.nextDouble(); // 1
        double y3 = sc.nextDouble(); // 4
        System.out.println("Nhap diem D: ");
        double x4 = sc.nextDouble(); // 5
        double y4 = sc.nextDouble(); // 8        
        Diem c = new Diem(x3, y3);
        Diem d = new Diem(x4, y4);
        DoanThang cd = new DoanThang(c, d);
        
        System.out.printf("Doan thang CD: %s\n", cd.toString());
        System.out.printf("Do dai cua CD: %.2f\n", cd.doDai());
        System.out.printf("Trung diem cua CD: %s\n", cd.trungDiem().toString());
        
        if (ab.songSong(cd))
            System.out.println("AB va CD song song");
        else
            System.out.println("AB va CD khong song song");
    }
}

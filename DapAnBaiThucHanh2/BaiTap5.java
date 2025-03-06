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
public class BaiTap5 {
    public static void nhapDs(Scanner sc, DsPhanSo ds, int n) {
        for (int i = 0; i < n; i++) {
            PhanSo ps = BaiTap4.nhapPs(sc);
            ds.them(ps);
        }
    }            
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DsPhanSo ds = new DsPhanSo();
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        nhapDs(sc, ds, n);
        System.out.printf("Danh sach phan so:\n%s", ds);
        System.out.printf("\nTong cua danh sach: %s\n", ds.tinhTong());
        ds.xoa(new PhanSo(1, 4));
        System.out.printf("Danh sach phan so sau khi xoa:\n%s", ds);
        ds.sapXep();
        System.out.printf("Danh sach phan so sau khi sap xep:\n%s", ds);
    }
}

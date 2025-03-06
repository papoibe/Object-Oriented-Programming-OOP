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
public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai HCN: ");
        int d = sc.nextInt();
        System.out.println("Nhap chieu rong HCN: ");
        int r = sc.nextInt();
        
        HinhChuNhat hcn = new HinhChuNhat(d, r);
        System.out.printf("Chieu dai HCN: %d\n", hcn.getChieuDai());
        System.out.printf("Chieu rong HCN: %d\n", hcn.getChieuRong());        
        System.out.printf("Chu vi HCN: %d\n", hcn.tinhChuVi());
        System.out.printf("Dien tich HCN: %d\n", hcn.tinhDienTich());        
        
        System.out.println("Nhap chieu dai HCN: ");
        d = sc.nextInt();
        System.out.println("Nhap chieu rong HCN: ");
        r = sc.nextInt();
        
        hcn.setChieuDai(d);
        hcn.setChieuRong(r);
        System.out.printf("Chu vi HCN: %d\n", hcn.tinhChuVi());
        System.out.printf("Dien tich HCN: %d\n", hcn.tinhDienTich());        
    }
}

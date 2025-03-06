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
public class BaiTap4 {
    public static PhanSo nhapPs(Scanner sc) {
        int t = 0, m = 0;
        PhanSo ps = null;
        do {
            try {
                System.out.println("Nhap tu so va mau so: ");
                t = sc.nextInt();                
                m = sc.nextInt();
                ps = new PhanSo(t, m);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } 
        } while(m == 0);
        return ps;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan so 1:");
        PhanSo ps1 = nhapPs(sc);
        System.out.println("Nhap phan so 2:");
        PhanSo ps2 = nhapPs(sc);       
        
        ps1 = ps1.rutGon();
        ps2 = ps2.rutGon();
        
        System.out.printf("Phan so 1: %s\n", ps1.toString());
        System.out.printf("Phan so 2: %s\n", ps2.toString());
        System.out.printf("Phep cong: %s\n", ps1.cong(ps2));
        System.out.printf("Phep tru: %s\n", ps1.tru(ps2));
        System.out.printf("Phep nhan: %s\n", ps1.nhan(ps2));
        try {
            System.out.printf("Phep chia: %s\n", ps1.chia(ps2));           
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        switch (ps1.soSanh(ps2)) {
            case -1 -> System.out.println("Phan so 1 nho hon phan so 2");
            case 1 -> System.out.println("Phan so 1 lon hon phan so 2");
            default -> System.out.println("Phan so 1 bang phan so 2");
        }
    }
}

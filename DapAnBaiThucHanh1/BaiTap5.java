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
public class BaiTap5 {
    static Scanner sc = new Scanner(System.in);
    
    static void nhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }
    
    static void xuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = %d, ", i, a[i]);
        }
        System.out.print("\b\b\n");
    }
    
    static int tinhTongNT(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (BaiTap4.checkPrime(a[i])) // Su dung ham checkPrime cua bai 4
                sum += a[i];
        }
        return sum;
    }
    
    static int timKiem(int[] a, int n, int x) {
        int i = 0;
        while (i < n && a[i] != x) {
            i++;
        }
        if (i == n)
            return -1;
        else 
            return i;
    }            
    
    public static void main(String[] args) {        
        int [] arr = new int[100];        
        System.out.print("Hay nhap n: "); // Java khong the truyen so nguyen theo kieu tham chieu nen hay dung cach nay
        int n = sc.nextInt();
        nhapMang(arr, n);
        xuatMang(arr, n);
        System.out.printf("Tong so nguyen to la %d.\n", tinhTongNT(arr, n));
        System.out.print("Hay nhap so can tim: ");
        int x = sc.nextInt();
        int kq = timKiem(arr, n, x);
        if (kq != -1)
            System.out.printf("Tim thay so %d tai %d.\n", x, kq);
        else
            System.out.printf("Khong tim thay so %d.\n", x);
    }
}

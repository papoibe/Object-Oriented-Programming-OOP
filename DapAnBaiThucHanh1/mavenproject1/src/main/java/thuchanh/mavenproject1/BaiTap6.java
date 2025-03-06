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
public class BaiTap6 {
    static Scanner sc = new Scanner(System.in);
    
    static void nhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap arr[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }   
    
    static int tinhDaThuc(int[] a, int n, int x) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * (int) Math.pow(x, i);
        }
        
        return sum;
    }            
    
    public static void main(String[] args) {
        int n, x;
        int[] arr = new int[100];
                
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        
        nhapMang(arr, n + 1);
        
        System.out.print("Nhap x = ");
        x = sc.nextInt();
        
        int kq = tinhDaThuc(arr, n + 1, x);
        System.out.printf("Ket qua cua da thuc la: %d.\n", kq);
    }
}

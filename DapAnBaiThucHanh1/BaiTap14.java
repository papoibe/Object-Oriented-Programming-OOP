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
public class BaiTap14 {
    final static int MAX = 100;
    static Scanner sc = new Scanner(System.in);
    
    static void nhapMaTran(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    static void xuatMaTran(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");              
            }
            System.out.print("\n");
        }
    }
    
    static void tongCacDong(int[][] a, int m, int n) {
        int maxD = 0;
        int vtMax = 0;
        for (int i = 0; i < m; i++) {
            int sumD = 0;
            for (int j = 0; j < n; j++)
                sumD += a[i][j];
                
            if (maxD < sumD) {
                maxD = sumD;
                vtMax = i;
            }
            
            System.out.printf("Tong cua dong %d la %d.\n", i, sumD);
        }
        System.out.printf("Dong co tong lon nhat la %d (%d).\n", vtMax, maxD);
    }
    
    static void tongCacCot(int[][] a, int m, int n) {
        int minC = Integer.MAX_VALUE;
        int vtMin = 0;
        for (int j = 0; j < n; j++) {
            int sumC = 0;
            for (int i = 0; i < m; i++)
                sumC += a[i][j];
                
            if (minC > sumC) {
                minC = sumC;
                vtMin = j;
            }
            
            System.out.printf("Tong cua cot %d la %d.\n", j, sumC);
        }
        System.out.printf("Cot co tong nho nhat la %d (%d).\n", vtMin, minC);
    }
    
    static void tongDong(int[][] a, int m, int n, int d) {        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (min > a[d][j])
                min = a[d][j];
            sum += a[d][j];
        }

        System.out.printf("Tong cua dong %d la %d.\n", d, sum);
        System.out.printf("Gia tri nho nhat cua dong %d la %d.\n", d, min);
    }
    
    static void tongCot(int[][] a, int m, int n, int c) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
            if (max < a[i][c])
                max = a[i][c];
            sum += a[i][c];
        }

        System.out.printf("Tong cua dong %d la %d.\n", c, sum);
        System.out.printf("Gia tri nho nhat cua dong %d la %d.\n", c, max);
    }
    
    public static void main(String[] args) {
        int[][] a = new int[MAX][MAX];
        int m, n;
        System.out.println("Nhap m = ");
        m = sc.nextInt();
        System.out.println("Nhap n = ");
        n = sc.nextInt();
        nhapMaTran(a, m, n);
        xuatMaTran(a, m, n);
        tongCacDong(a, m, n);
        tongCacCot(a, m, n);
        
        System.out.println("Nhap dong d = ");        
        int d = sc.nextInt();
        tongDong(a, m, n, d);
        System.out.println("Nhap cot c = ");
        int c = sc.nextInt();
        tongCot(a, m, n, c);
    }
}

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
public class BaiTap4 {
    static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else 
            for (int i = 3; i <= (int)Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap mot so nguyen bat ky: ");
        int n = sc.nextInt();
        
        if (checkPrime(n))
            System.out.printf("%d la so nguyen to.\n", n);
        else
            System.out.printf("%d khong la so nguyen to.\n", n);
    }
}

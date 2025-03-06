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
public class BaiTap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int pred, choice, secretNumber;
        do {
            secretNumber = (int) (Math.random() * 100) + 1; // Math.random() tra ve tu 0.0 den 1.0
            do {
                System.out.println("Nhap vao du doan cua ban: ");
                pred = sc.nextInt();
                if (pred > secretNumber)
                    System.out.println("So ban doan lon hon");
                else if (pred < secretNumber)
                    System.out.println("So ban doan nho hon");
                else
                    System.out.println("Ban da doan dung");
            } while (pred != secretNumber);
                    
            System.out.println("Ban co muon tiep tuc khong?");
            choice = sc.nextInt();
        } while (choice != 0);
        
    }
}

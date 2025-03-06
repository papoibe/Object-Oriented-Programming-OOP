/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap9 {
    public static void main(String[] args) {
        ArrayList <String> dssv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;
        
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Them sinh vien.");
            System.out.println("2. Xuat danh sach sinh vien.");
            System.out.println("3. Xoa sinh vien.");
            System.out.println("4. Tim kiem sinh vien.");     
            System.out.println("5. Thoat chuong trinh.");     
            System.out.println("Moi ban nhap lua chon cua ban: ");     
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Nhap ten sinh vien muon them: ");
                    name = sc.nextLine();
                    dssv.add(name);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien: ");
                    for (String sv : dssv) {
                        System.out.println(sv);                        
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten sinh vien muon xoa: ");
                    name = sc.nextLine();
                    int i = 0;
                    while (i < dssv.size() && !dssv.get(i).contains(name)) {                            
                        i++;
                    }
                    if (i == dssv.size())                    
                        System.out.println("Khong tim thay sinh vien.");
                    else {
                        dssv.remove(i);
                        System.out.println("Xoa thanh cong.");
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten sinh vien muon tim: ");
                    name = sc.nextLine();
                    i = 0;
                    while (i < dssv.size() && !dssv.get(i).contains(name)) {                            
                        i++;
                    }
                    if (i == dssv.size())                    
                        System.out.println("Khong tim thay sinh vien.");
                    else {                        
                        System.out.printf("Tim thay sinh vien %s tai vi tri %d.\n", name, i);
                    }
                    break;
                case 5:
                    System.out.println("Chao tam biet!");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le!");
            }
            
        } while (choice != 5);
    }
}

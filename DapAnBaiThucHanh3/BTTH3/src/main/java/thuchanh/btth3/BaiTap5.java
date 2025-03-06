/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class BaiTap5 {
    public static void main(String[] args) {
        ArrayList<VanDongVien> dsVDV = new ArrayList<>();
        try {
            File f = new File("D:\\NetBeansProjects\\Bai3\\app\\src\\main\\resources\\VanDongVien.txt");
            Scanner sc = new Scanner(f);  
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] info = line.split(",");
                VanDongVien v = null;
                switch (info.length) {
                    case 2 -> v = new VanDongVien(info[0], info[1]);
                    case 3 -> v = new VDVBoi(info[0], "Boi loi", info[1], info[2]);
                    case 4 -> v = new VDVBongDa(info[0], "Bong da", info[1], Integer.parseInt(info[2]), info[3]);
                }
                    
                dsVDV.add(v);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("========MENU========");
        System.out.println("1. In danh sach VDV");
        System.out.println("2. Tim kiem theo ten mon the thao");
        System.out.println("3. Tim kiem theo vi tri cau thu");
        System.out.println("4. Tim kiem theo CLB bong da");
        System.out.println("5. Tim kiem theo so truong VDV boi");
        System.out.print("Nhap tu 1-5: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        sc.nextLine();
        switch (luaChon) {
            case 1 -> {
                dsVDV.forEach(v -> {
                    System.out.println(v);
                });                
            }
            case 2 -> {
                System.out.println("Nhap mon the thao: ");                
                String m = sc.nextLine();
                if (dsVDV.stream().filter(v -> v.getMonThiDau().equalsIgnoreCase(m)).count() == 0)
                    System.out.println("Khong tim thay van dong vien nao");
                else 
                    dsVDV.stream().filter(v -> v.getMonThiDau().equalsIgnoreCase(m))
                            .forEach(v -> {
                                System.out.println(v);
                            });
            }
            case 3 -> {
                System.out.println("Nhap vi tri cau thu: ");
                String vt = sc.nextLine();
                if (dsVDV.stream()
                        .filter(v -> v instanceof VDVBongDa)
                        .filter(v -> {
                            VDVBongDa bd = (VDVBongDa)v;
                            return bd.getViTri().equalsIgnoreCase(vt);
                        })
                        .count() == 0)
                    System.out.println("Khong tim thay cau thu");
                else{
                    dsVDV.stream()
                            .filter(v -> v instanceof VDVBongDa)
                            .filter(v -> {
                                    VDVBongDa bd = (VDVBongDa)v;
                                    return bd.getViTri().equalsIgnoreCase(vt);
                            })
                            .forEach(v -> System.out.println(v));
                }
            }
            
            case 4 -> {
                System.out.println("Nhap CLB bong da: ");
                String c = sc.nextLine();
                if (dsVDV.stream()
                        .filter(v -> v instanceof VDVBongDa)
                        .filter(v -> {
                            VDVBongDa bd = (VDVBongDa)v;
                            return bd.getClb().equalsIgnoreCase(c);
                        })
                        .count() == 0)
                    System.out.println("Khong tim thay cau thu");
                else{
                    dsVDV.stream()
                            .filter(v -> v instanceof VDVBongDa)
                            .filter(v -> {
                                    VDVBongDa bd = (VDVBongDa)v;
                                    return bd.getClb().equalsIgnoreCase(c);
                            })
                            .forEach(v -> System.out.println(v));
                }
            }
            
            case 5 -> {
                System.out.println("Nhap cu ly: ");
                int c = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap kieu boi: ");
                String k = sc.nextLine();
                
                if (dsVDV.stream()
                        .filter(v -> v instanceof VDVBoi)
                        .filter(v -> {
                                VDVBoi b = (VDVBoi)v;
                                String[] st = b.getSoTruong().split("m ");
                                return Integer.parseInt(st[0]) == c && st[1].equalsIgnoreCase(k);
                        })
                        .count() == 0)
                    System.out.println("Khong tim thay cau thu");
                else {
                    dsVDV.stream()
                            .filter(v -> v instanceof VDVBoi)
                            .filter(v -> {
                                    VDVBoi b = (VDVBoi)v;
                                    String[] st = b.getSoTruong().split("m ");
                                    return Integer.parseInt(st[0]) == c && st[1].equalsIgnoreCase(k);
                            })
                            .forEach(v -> System.out.println(v));
                 }
            }
        }
    }
}

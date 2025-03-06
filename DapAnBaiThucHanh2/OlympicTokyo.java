/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OlympicTokyo {
    private ArrayList<QuocGia> arrQG;
    private ArrayList<ThanhTich> arrTT;
    
    public OlympicTokyo(String pathQG, String pathTT) {
        // Khoi tao 2 danh sach rong
        File f;
        String line;
        arrQG = new ArrayList<>();
        arrTT = new ArrayList<>();
        try {
            f = new File(pathQG);
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] info = line.split(",");
                QuocGia q = new QuocGia(
                        info[0], 
                        info[1], 
                        Integer.parseInt(info[2]), 
                        Integer.parseInt(info[3])
                );
                arrQG.add(q);
            }            
            sc.close();
            
            f = new File(pathTT);
            sc = new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            line = sc.nextLine(); // lay dong ten nuoc
            String[] arrTenNuoc = line.split(","); // tach cac ten nuoc
            for (int i = 0; i < 20; i++) { // duyet cac thanh tich 
                line = sc.nextLine();
                String[] info = line.trim().split(","); // tach cac so huy chuong
                ThanhTich t = new ThanhTich(
                        arrTenNuoc[i], 
                        Integer.parseInt(info[0]), 
                        Integer.parseInt(info[1]), 
                        Integer.parseInt(info[2])
                );
                arrTT.add(t);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void timKiemTenQG(String tenQG) {
        // tim kiem quoc gia theo tenQG
        QuocGia kq = arrQG.stream().filter(q -> q.getTenNuoc().equalsIgnoreCase(tenQG)).findFirst().orElse(null);
        if (kq != null) {
            // tim kiem thanh tich theo tenQG
            ThanhTich tt = arrTT.stream().filter(t -> t.getTenNuoc().equalsIgnoreCase(tenQG)).findFirst().orElse(null);
            System.out.println(kq);
            System.out.println(tt);
        }
        else
            System.out.println("Khong tim thay ten quoc gia");
    }
    
    public void timKiemTheoV(int v) {
        // loc danh sach cac thanh tich co huy chuong vang >= v
        if (arrTT.stream().filter(t -> t.getVang() >= v).count() != 0) {
            arrTT.stream().filter(t -> t.getVang() >= v).forEach(t -> {
                // tim cac quoc gia co thanh tich tuong ung de in ra man hinh
                arrQG.stream()
                        .filter(q -> q.getTenNuoc().equalsIgnoreCase(t.getTenNuoc()))
                        .forEach(q -> {
                            System.out.println(q);
                            System.out.println(t);
                        });
            });               
        } else {
            System.out.println("Khong tim thay quoc gia nao");
        }
    }
    
    public void inQuocGia(String tenQG, String path) {
        QuocGia qg = arrQG.stream().filter(q -> q.getTenNuoc().equalsIgnoreCase(tenQG)).findAny().orElse(null);
        if (qg != null) {
            ThanhTich tt = arrTT.stream().filter(t -> t.getTenNuoc().equalsIgnoreCase(tenQG)).findAny().orElse(null);
            try {
                PrintWriter writer = new PrintWriter(path);
                writer.println(qg);
                writer.println(tt);
                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
        }   
        }
        else
            System.out.println("Khong tim thay ten quoc gia");
                 
    }
}

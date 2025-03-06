/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DoiTuyenQuocGia {
    private ArrayList<CauThu> dsCauThu;

    public DoiTuyenQuocGia(String path) {
        dsCauThu = new ArrayList<>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] info = line.split(",");
                CauThu ct = new CauThu(
                        info[0], 
                        info[1], 
                        Integer.parseInt(info[2]), 
                        info[3]);
                dsCauThu.add(ct);
            }            
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void timKiemTenCLB(String tenCLB) {
        if (dsCauThu.stream().filter(ct -> ct.getClb().equalsIgnoreCase(tenCLB)).count() == 0)
            System.out.println("Khong tim thay cau thu nao");
        else
            dsCauThu.stream().filter(ct -> ct.getClb().equalsIgnoreCase(tenCLB)).forEach(ct -> System.out.println(ct));
    }
    
    public void timKiemViTri(String viTri) {        
        if (dsCauThu.stream().filter(ct -> ct.getViTri().equalsIgnoreCase(viTri)).count() == 0)
            System.out.println("Khong tim thay cau thu nao");
        else
            dsCauThu.stream().filter(ct -> ct.getViTri().equalsIgnoreCase(viTri)).forEach(ct -> System.out.println(ct));
    }
}

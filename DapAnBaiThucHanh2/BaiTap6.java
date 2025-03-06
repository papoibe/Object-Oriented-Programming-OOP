/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class BaiTap6 {
    
    public static void main(String[] args) {                      
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); // dam bao nhung ngay hop le
        String path = "D:\\NetBeansProjects\\Bai2\\app\\src\\main\\resources\\HocSinh.txt";
        try {                        
            HocSinh hs = new HocSinh("Nguyen Van A", df.parse("28/02/2023"), 
                    "Tay Ninh", 8.0, 6.0, 7.0);
            System.out.println(hs);
            QLHS list = new QLHS(path);        
            list.them(hs, path);
//            list.xoa("HS-0001");
            list.sapXepGiamDan();
            System.out.println(list);
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le");
        }                
    }
}

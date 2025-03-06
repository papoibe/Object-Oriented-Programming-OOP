/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class BaiTap4 {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Nguyen Van Nhan", "0123", "HCM", NhanVien.GioiTinh.NAM, "0123456");
        NhanVien nvA = new NhanVienA("Nguyen Van A", "0123", "HCM", NhanVien.GioiTinh.NAM, "0123456");
        NhanVien nvB = new NhanVienB("Nguyen Van B", "0123", "HCM", NhanVien.GioiTinh.NAM, "0123456");
        NhanVien nvC = new NhanVienC("Nguyen Thi C", "0123", "HCM", NhanVien.GioiTinh.NU, "0123456");
        System.out.println(nv);
        System.out.println(nvA);
        System.out.println(nvB);
        System.out.println(nvC);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author admin
 */
public class BaiTap8 {
    public static void main(String[] args) {
        DoiTuyenQuocGia dt = new DoiTuyenQuocGia("D:\\NetBeansProjects\\Bai2\\app\\src\\main\\resources\\DoiTuyenQuocGiaVN.txt");
        System.out.println("Danh sach cau thu theo CLB: ");
        dt.timKiemTenCLB("CLB Ha Noi");
        System.out.println("Danh sach cau thu theo vi tri: ");
        dt.timKiemViTri("Hau ve");
    }
    
}

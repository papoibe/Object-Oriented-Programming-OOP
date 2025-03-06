/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class NhanVienC extends NhanVien {
    {
        this.maSo = String.format("NVC%04d", getDem());
    }

    public NhanVienC(String hoTen, String cccd, String queQuan, GioiTinh gioiTinh, String sdt) {
        super(hoTen, cccd, queQuan, gioiTinh, sdt);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong) * 2.5;
    }       

    @Override
    public String toString() {
        return String.format("\n%s\nBo phan: C", super.toString());
    }      
}

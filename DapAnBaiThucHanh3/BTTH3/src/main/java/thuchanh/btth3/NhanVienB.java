/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class NhanVienB extends NhanVien{
    {
        this.maSo = String.format("NVB%04d", getDem());
    }

    public NhanVienB(String hoTen, String cccd, String queQuan, NhanVien.GioiTinh gioiTinh, String sdt) {
        super(hoTen, cccd, queQuan, gioiTinh, sdt);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong) * 1.5;
    }       

    @Override
    public String toString() {
        return String.format("\n%s\nBo phan: B", super.toString());
    }      
}

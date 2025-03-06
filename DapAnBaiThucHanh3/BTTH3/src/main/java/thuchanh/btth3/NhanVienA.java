/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class NhanVienA extends NhanVien{    
    {
        this.maSo = String.format("NVA%04d", getDem());
    }

    public NhanVienA(String hoTen, String cccd, String queQuan, GioiTinh gioiTinh, String sdt) {
        super(hoTen, cccd, queQuan, gioiTinh, sdt);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong) * 1.2;
    }       

    @Override
    public String toString() {
        return String.format("\n%s\nBo phan: A", super.toString());
    }        
}

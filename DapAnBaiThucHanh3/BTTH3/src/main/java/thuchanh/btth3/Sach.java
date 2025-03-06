/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach(int soTrang, String maSP, String tenSP, String moTa, String nhaSX, int giaBan) {
        super(maSP, tenSP, moTa, nhaSX, giaBan);
        this.soTrang = soTrang;
    }        

    @Override
    public String toString() {
        return String.format("%s\nSo trang: %s", super.toString(), soTrang);
    }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class BangDia extends SanPham{
    private int thoiLuong;

    public BangDia(int thoiLuong, String maSP, String tenSP, String moTa, String nhaSX, int giaBan) {
        super(maSP, tenSP, moTa, nhaSX, giaBan);
        this.thoiLuong = thoiLuong;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nThoi luong: %s", super.toString(), thoiLuong);
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private String moTa;
    private String nhaSX;
    private int giaBan;

    public SanPham(String maSP, String tenSP, String moTa, String nhaSX, int giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.nhaSX = nhaSX;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }        
    
    public int soSanhGiaBan(SanPham sp) {
        return Integer.compare(this.giaBan, sp.getGiaBan());
    }

    @Override
    public String toString() {
        return String.format("\n=============\nMa so: %s\nTen san pham: %s\nMo ta: %s\nNha sx: %s\nGia: %d\n", 
                maSP, tenSP, moTa, nhaSX, giaBan);
    }           

    @Override
    public boolean equals(Object obj) {
        SanPham sp = (SanPham)obj;
        return this.maSP.equalsIgnoreCase(sp.maSP);
    }       
}

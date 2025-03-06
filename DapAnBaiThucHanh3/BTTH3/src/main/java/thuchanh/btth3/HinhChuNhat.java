/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f", this.getClass().getSimpleName(), tinhDienTich(), tinhChuVi());
    }      
}

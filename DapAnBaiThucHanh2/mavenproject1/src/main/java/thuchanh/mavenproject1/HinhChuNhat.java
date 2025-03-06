/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author Huy
 */
public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;
    
    public HinhChuNhat() {
        this.chieuDai = 1;
        this.chieuRong = 1;
    }
    
    public HinhChuNhat(int d, int r) {       
        this.chieuDai = d;
        this.chieuRong = r;
    }
    
    public int getChieuDai() {
        return this.chieuDai;
    }
    
    public int getChieuRong() {
        return this.chieuRong;
    }
    
    public void setChieuDai(int d) {
        this.chieuDai = d;
    }
    
    public void setChieuRong(int r) {
        this.chieuRong = r;
    }
    
    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
}
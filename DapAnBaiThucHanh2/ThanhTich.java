/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author admin
 */
public class ThanhTich {
    private String tenNuoc;
    private int vang;
    private int bac;
    private int dong;

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public int getVang() {
        return vang;
    }

    public void setVang(int vang) {
        this.vang = vang;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getDong() {
        return dong;
    }

    public void setDong(int dong) {
        this.dong = dong;
    }

    public ThanhTich(String tenNuoc, int vang, int bac, int dong) {
        this.tenNuoc = tenNuoc;
        this.vang = vang;
        this.bac = bac;
        this.dong = dong;
    }

    @Override
    public String toString() {
        return String.format("Vang: %d - Bac: %d - Dong: %d",
                vang, bac, dong);
    }
        
}

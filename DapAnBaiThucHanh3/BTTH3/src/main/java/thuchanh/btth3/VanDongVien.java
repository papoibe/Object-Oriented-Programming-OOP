/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class VanDongVien {
    private String hoTen;
    private String monThiDau;

    public VanDongVien(String hoTen, String monThiDau) {
        this.hoTen = hoTen;
        this.monThiDau = monThiDau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

    @Override
    public String toString() {
        return String.format("===========\nHo ten: %s\nMon: %s",
                hoTen, monThiDau);
    }         
}

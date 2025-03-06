/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class VDVBoi extends VanDongVien {
    private String soTruong;
    private String clb;

    public VDVBoi(String hoTen, String monThiDau, String clb, String soTruong) {
        super(hoTen, monThiDau);
        this.soTruong = soTruong;
        this.clb = clb;
    }

    public String getSoTruong() {
        return soTruong;
    }

    public void setSoTruong(String soTruong) {
        this.soTruong = soTruong;
    }

    public String getClb() {
        return clb;
    }

    public void setClb(String clb) {
        this.clb = clb;
    }

    @Override
    public String toString() {
        return String.format("\n%s\nSo truong: %s\nCLB: %s",
                super.toString(), soTruong, clb);
    }      
}

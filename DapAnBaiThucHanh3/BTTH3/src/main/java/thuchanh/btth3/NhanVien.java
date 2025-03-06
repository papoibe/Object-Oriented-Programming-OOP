/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class NhanVien {
    public enum GioiTinh {
        NAM, NU
        
    }
    
    private static int dem;
    private final int luong = 100000;
    protected String maSo;
    private String hoTen;
    private String cccd;
    private String queQuan;
    private GioiTinh gioiTinh;
    private String sdt;
    
    {
        dem++;
        if (dem > 9999)
            throw new IllegalStateException("Khong the tiep tuc them nhan vien");
        maSo = String.format("NV%04d", dem);
    }

    public NhanVien(String hoTen, String cccd, String queQuan, GioiTinh gioiTinh, String sdt) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public static int getDem() {
        return dem;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }        
    
    public double tinhLuong(int soNgayCong) {
        return luong * soNgayCong;
    }

    @Override
    public String toString() {
        return String.format("\n=============\nMa so: %s\nHo ten: %s\nCCCD: %s\nGioi tinh: %s\nQue quan: %s\nSDT: %s", 
                maSo, hoTen, cccd, gioiTinh, queQuan, sdt);
    }
        
}

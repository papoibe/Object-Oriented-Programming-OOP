/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

import java.util.Calendar;

/**
 *
 * @author Huy
 */
public class CongDan {
    private String hoTen;
    private String cccd;
    private String noiSinh;
    private String ngheNghiep;
    private int ngaySinh;
    private int thangSinh;
    private int namSinh;

    public CongDan(String hoTen, String cccd, String noiSinh, String ngheNghiep, int ngaySinh, int thangSinh, int namSinh) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.noiSinh = noiSinh;
        this.ngheNghiep = ngheNghiep;
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
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

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public int getTuoi() {
        Calendar ngayHienTai = Calendar.getInstance();
        return ngayHienTai.get(Calendar.YEAR) - namSinh;                
    }

    @Override
    public String toString() {
        return String.format("\n==============\nHo ten: %s\nCCCD: %s\nNoi sinh: %s\nNgay sinh: %02d/%02d/%02d\nNghe nghiep: %s",
                hoTen, cccd, noiSinh, ngaySinh, thangSinh, namSinh, ngheNghiep);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class HocSinh extends CongDan {
    private double diemVan;
    private double diemToan;
    private double diemAnh;
    private String hanhKiem;

    public HocSinh(String hoTen, String cccd, String noiSinh, String ngheNghiep, int ngaySinh, int thangSinh, int namSinh, double diemVan, double diemToan, double diemAnh, String hanhKiem) {
        super(hoTen, cccd, noiSinh, ngheNghiep, ngaySinh, thangSinh, namSinh);
        this.diemVan = diemVan;
        this.diemToan = diemToan;
        this.diemAnh = diemAnh;
        this.hanhKiem = hanhKiem;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }
    
    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    @Override
    public String toString() {
        return String.format("%s\nDiem toan: %.1f\nDiem van: %.1f\nDiem anh: %.1f\nHanh kiem: %s", 
                super.toString(), diemToan, diemVan, diemAnh, hanhKiem);
    }
    
    
}

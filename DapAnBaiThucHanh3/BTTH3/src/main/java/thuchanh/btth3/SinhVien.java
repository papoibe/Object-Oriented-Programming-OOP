/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class SinhVien extends CongDan {
    private String nganhHoc;
    private String daiHoc;

    public SinhVien(String hoTen, String cccd, String noiSinh, String ngheNghiep, int ngaySinh, int thangSinh, int namSinh, String nganhHoc, String daiHoc) {
        super(hoTen, cccd, noiSinh, ngheNghiep, ngaySinh, thangSinh, namSinh);
        this.nganhHoc = nganhHoc;
        this.daiHoc = daiHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getDaiHoc() {
        return daiHoc;
    }

    public void setDaiHoc(String daiHoc) {
        this.daiHoc = daiHoc;
    }    

    @Override
    public String toString() {
        return String.format("%s\nNganh: %s\nDai hoc: %s", 
                super.toString(), nganhHoc, daiHoc);
    }
    
    
}

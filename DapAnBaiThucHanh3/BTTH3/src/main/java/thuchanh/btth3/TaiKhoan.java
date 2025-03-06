/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Huy
 */
public class TaiKhoan {
    // Tao thuoc tinh date format de su dung cho cac lop con
    public static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
    private String soTK;
    private String tenTK;
    protected BigDecimal soTien; // de co the luu tru so cuc ky lon
    private Date ngayTao;
    
    {
        soTK = String.format("%05d", ++dem);
        ngayTao = new Date();                
    }

    public TaiKhoan(String tenTK, BigDecimal soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }
        
    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public BigDecimal getSoTien() {
        return soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    public void rutTien(BigDecimal st) {
        if (this.isDaoHan())
            if (this.soTien.compareTo(st) >= 0)
                this.soTien = this.soTien.subtract(st); // tru
    }
    
    public void nopTien(BigDecimal st) {
        if (this.isDaoHan())
            this.soTien = this.soTien.add(st); // cong
    }
    
    public boolean isDaoHan() { // su dung ham nay de khong can override rutTien va nopTien
        return true;
    }
    
    public BigDecimal tinhLai() {
        // tai khoang khong ky han tinh lai theo thang nen chia 12
        return this.soTien.multiply(new BigDecimal(0.001)).divide(new BigDecimal(12));
    }

    @Override
    public String toString() {
        return String.format("\n===========\nSo tk: %s\nTen tk: %s\nSo tien: %.1f VND\nNgay tao: %s",
                soTK, tenTK, soTien, df.format(ngayTao));
                
    }        
}

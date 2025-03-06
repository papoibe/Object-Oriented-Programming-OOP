/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Huy
 */
public class TaiKhoanCoKyHan extends TaiKhoan {
    private KyHan kyHan;
    private Calendar ngayDaoHan; // su dung Calendar thay vi Date de thuan tien tinh toan

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
       
    public TaiKhoanCoKyHan(String tenTK, BigDecimal soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = this.kyHan.tinhDaoHan(new GregorianCalendar());
        // new GregorianCalendar() de lay ngay hien tai
    }
    
    public void capNhatDaoHan() {
        this.ngayDaoHan = this.kyHan.tinhDaoHan(this.ngayDaoHan);
    }

    @Override
    public BigDecimal tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }        

    @Override
    public boolean isDaoHan() {
        // Khong can phai ghi de nopTien va rutTien
        Calendar d = new GregorianCalendar(); // lay ngay hien tai;
        // chuyen ca 2 ve chuoi de so sanh
        String s1 = df.format(d.getTime());
        String s2 = df.format(this.ngayDaoHan.getTime());
        return s1.equals(s2);
    }   

    @Override
    public String toString() {
        return String.format("%s\nKy han %s\nNgay dao han: %s", 
                super.toString(), kyHan, df.format(ngayDaoHan.getTime()));
    }
        
    
}

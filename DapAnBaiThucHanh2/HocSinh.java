/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class HocSinh {
    private static int dem = 0;
    private String maSo;
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
    private double toan;
    private double van;
    private double anh;        
    
    {
        if (dem > 9999) {
            throw new IllegalStateException("Loi khong the tao them sinh vien");
        }
        dem++;
        maSo = String.format("HS-%04d", dem);
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }

    public HocSinh(String hoTen, Date ngaySinh, String queQuan, double toan, double van, double anh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }   
    
    public double dtb() {
        return (toan + van + anh) / 3.0;
    }
    
    public String hocLuc() {
        double d = dtb();
        if (d >= 8.0)
            return "Gioi";
        else if (d >= 6.5)
            return "Kha";
        else if (d >= 5.0)
            return "Trung binh";
        else
            return "Yeu";
    }
    
    public int getTuoi() {
        Calendar ngayHienTai = Calendar.getInstance();
        Calendar ns = Calendar.getInstance();        
        ns.setTime(ngaySinh);
        int tuoi = ngayHienTai.get(Calendar.YEAR) - ns.get(Calendar.YEAR);
        
        if (ngayHienTai.get(Calendar.MONTH) < ns.get(Calendar.MONTH) || 
            (ngayHienTai.get(Calendar.MONTH) == ns.get(Calendar.MONTH) && 
            ngayHienTai.get(Calendar.DAY_OF_MONTH) < ns.get(Calendar.DAY_OF_MONTH))) {
            tuoi--;
        } // Neu du nam nhung chua du thang hoac ngay
        
        return tuoi;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Ma so: %s\nHo ten: %s\nNgay sinh: %s\nQue quan: %s\nDiem toan: %.2f\nDiem van: %.2f\nDiem anh: %.2f\nDiem TB: %.2f\nHoc luc: %s\n", maSo, hoTen, dateFormat.format(ngaySinh), queQuan, toan, van, anh, dtb(), hocLuc());
    }
    
    public int soSanh(HocSinh hs) {
        return Double.compare(this.dtb(), hs.dtb());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Kiem tra tham chieu
        if (obj == null || this.getClass() != obj.getClass()) return false; // Kiem tra kieu du lieu
        HocSinh hs = (HocSinh) obj;
        return this.maSo.contains(hs.getMaSo());
    }            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.util.Objects;

/**
 *
 * @author Huy
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0)           
            throw new IllegalArgumentException("Loi mau so khong duoc la 0");
        this.mauSo = mauSo;
    }
    
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0)           
            throw new IllegalArgumentException("Loi mau so khong duoc la 0");
        this.tuSo = tuSo;                
        this.mauSo = mauSo;
    } 
    
    public static int ucln(int a, int b) {
        if (b == 0)
            return a;
        else 
            return ucln(b, a % b);
    }
    
    public PhanSo rutGon() {
        int u = ucln(tuSo, mauSo);
        int t = this.tuSo / u;
        int m = this.mauSo / u;
        if (m < 0) {
            m = -m;
            t = -t;
        }
        return new PhanSo(t, m);
    }
    
    public PhanSo cong(PhanSo ps) {
        int t = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);        
        return kq.rutGon();
    }
    
    public PhanSo tru(PhanSo ps) {
        int t = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);        
        return kq.rutGon();
    }
    
    public PhanSo nhan(PhanSo ps) {
        int t = this.tuSo * ps.tuSo;
        int m = this.mauSo * ps.mauSo;
        PhanSo kq = new PhanSo(t, m);        
        return kq.rutGon();
    }
    
    public PhanSo chia(PhanSo ps) {
        if (ps.tuSo == 0)
            throw new IllegalArgumentException("Loi chia phan so cho 0");
        int t = this.tuSo * ps.mauSo;
        int m = this.mauSo * ps.tuSo;
        PhanSo kq = new PhanSo(t, m);        
        return kq.rutGon();
    }

    // lon hon: 1, nho hon: -1, bang nhau: 0
    public int soSanh(PhanSo ps) {
        int a = this.tuSo * ps.mauSo;
        int b = ps.tuSo * this.mauSo;
        return Integer.compare(a, b);    
    }  
    
    @Override
    public String toString() {
        if (this.tuSo == 0)
            return "0";
        if (this.mauSo == 1)
            return String.format("%d", tuSo);
        return String.format("%d/%d", tuSo, mauSo);
    }
    
    @Override
    public boolean equals(Object obj) {  
        if (this == obj) return true;  // Kiem tra tham chieu
        if (obj == null || this.getClass() != obj.getClass()) return false; // Kiem tra kieu du lieu
        PhanSo ps = (PhanSo) obj;
        return this.tuSo == ps.tuSo && this.mauSo == ps.mauSo; 
    }       

    @Override
    public int hashCode() {        
        return Objects.hash(tuSo, mauSo); // tao ma bam tu tu va mau
    }
}

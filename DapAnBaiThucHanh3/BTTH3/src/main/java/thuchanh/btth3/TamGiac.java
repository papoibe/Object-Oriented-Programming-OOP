/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class TamGiac {
    private double a, b, c;  
    
    public static boolean kiemTraTamGiac(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    public TamGiac(double a, double b, double c) throws IllegalArgumentException{
        if (kiemTraTamGiac(a, b, c))
            throw new IllegalArgumentException("Tam giac khong hop le");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double tinhChuVi() {
        return a + b + c;
    }
    
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f", this.getClass().getSimpleName(), tinhDienTich(), tinhChuVi());
    }  
}

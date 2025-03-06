/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class Ellipse {    
    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhDienTich() {
        return Math.PI * bkTrucLon * bkTrucNho;
    }
    
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((bkTrucLon * bkTrucLon + bkTrucNho * bkTrucNho) / 2.0);
    }

    @Override
    public String toString() {
        return String.format("Hinh %s\nDien tich: %.1f\nChu vi: %.1f", this.getClass().getSimpleName(), tinhDienTich(), tinhChuVi());
    }    
}

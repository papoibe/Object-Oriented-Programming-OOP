/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author Huy
 */
public class DoanThang {
    private Diem d1;
    private Diem d2;
    
    public DoanThang(Diem a, Diem b) {
        this.d1 = a;
        this.d2 = b;
    }
    
    public Diem getD1() {
        return d1;
    }

    public void setD1(Diem d1) {
        this.d1 = d1;
    }

    public Diem getD2() {
        return d2;
    }

    public void setD2(Diem d2) {
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return String.format("[(%.2f, %.2f), (%.2f, %.2f)]", d1.getX(), d1.getY(), d2.getX(), d2.getY());
    }
    
    public double doDai() {
        return d1.tinhKhoangCach(d2);
    }  
    
    public Diem trungDiem() {
        return new Diem((d1.getX() + d2.getX()) / 2.0, (d1.getY() + d2.getY()) / 2.0);
    }    
    
    public boolean songSong(DoanThang dt) {
        return (this.d1.getX() - this.d2.getX()) / (this.d1.getY() - this.d2.getY()) == (dt.d1.getX() - dt.d2.getX()) / (dt.d1.getY() - dt.d2.getY());
    }
}

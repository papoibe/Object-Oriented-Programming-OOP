/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author Huy
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public Diem(double x, double y) {
        this.hoanhDo = x;
        this.tungDo = y;
    }
    
    public double getX() {
        return this.hoanhDo;
    }
    
    public double getY() {
        return this.tungDo;
    }
    
    public void setX(int x) {
        this.hoanhDo = x;
    }
    
    public void setY(int y) {
        this.tungDo = y;
    }
    
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", this.hoanhDo, this.tungDo);
    }        
}

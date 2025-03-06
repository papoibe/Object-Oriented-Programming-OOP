/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author admin
 */

public class CauThu {
    private String hoTen;
    private String viTri;
    private int soAo;
    private String clb;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getClb() {
        return clb;
    }

    public void setClb(String clb) {
        this.clb = clb;
    }

    public CauThu(String hoTen, String viTri, int soAo, String clb) {
        this.hoTen = hoTen;
        this.viTri = viTri;
        this.soAo = soAo;
        this.clb = clb;
    }

    @Override
    public String toString() {
        return String.format("============\nHo ten: %s\nVi tri: %s\nSo ao: %d\nCLB: %s\n",
                hoTen, viTri, soAo, clb);
    }
    
    
}

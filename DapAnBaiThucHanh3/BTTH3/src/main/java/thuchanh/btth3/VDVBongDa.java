/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

/**
 *
 * @author Huy
 */
public class VDVBongDa extends VanDongVien {
    private String viTri;
    private int soAo;
    private String clb;

    public VDVBongDa(String hoTen, String monThiDau, String viTri, int soAo, String clb) {
        super(hoTen, monThiDau);
        this.viTri = viTri;
        this.soAo = soAo;
        this.clb = clb;
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

    @Override
    public String toString() {
        return String.format("%s\nVi tri: %s\nSo ao: %d\nCLB: %s",
                super.toString(), viTri, soAo, clb);
    }      
}

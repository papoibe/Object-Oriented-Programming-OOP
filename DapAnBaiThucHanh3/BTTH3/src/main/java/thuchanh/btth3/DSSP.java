/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai3;

import java.util.ArrayList;

/**
 *
 * @author Huy
 */
public class DSSP {
    private ArrayList<SanPham> arr;

    public DSSP() {
        arr = new ArrayList<>();
    }
    
    public void them(SanPham sp) {
        arr.add(sp);
    }
    
    public boolean xoa(SanPham sp) {
        return arr.remove(sp);
    }
    
    public SanPham timKiemTenSP(String tenSP) {
        SanPham kq = arr.stream().filter(sp -> sp.getTenSP().equalsIgnoreCase(tenSP))
                .findFirst()
                .orElse(null);
        return kq;
    }
    
    public SanPham timKiemMoTa(String moTa) {
        SanPham kq = arr.stream()
                .filter(sp -> sp.getMoTa().equalsIgnoreCase(moTa))
                .findFirst()
                .orElse(null);
        return kq;
    }
    
    public SanPham timKiemLoaiSP(String loaiSP) {
        SanPham kq = arr.stream()
                .filter(sp -> sp.getClass().getSimpleName().equalsIgnoreCase(loaiSP))
                .findFirst()
                .orElse(null);
        return kq;
    }
    
    public void sapXepGiaGiam() {
        arr.sort((SanPham sp1, SanPham sp2) -> {
            return -sp1.soSanhGiaBan(sp2);
        });
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        arr.forEach(sp -> {
            builder.append(sp);
        });
        return builder.toString();
    }
    
    
}

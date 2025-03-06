/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

import java.util.ArrayList;

/**
 *
 * @author Huy
 */
public class DsPhanSo {
    private ArrayList<PhanSo> arr;

    public DsPhanSo() {
        this.arr = new ArrayList<>();
    }
    
    public void them(PhanSo ps) {
        this.arr.add(ps);        
    }
    
    public boolean xoa(PhanSo ps) {             
        return this.arr.remove(ps);
    }       
    
    public PhanSo tinhTong() {
        PhanSo tong = new PhanSo(0, 1);
        for (PhanSo ps : arr) {
            tong = tong.cong(ps);
        }
        return tong;
    }
    
    public void sapXep() {
        arr.sort((PhanSo ps1, PhanSo ps2) -> {
            return ps1.soSanh(ps2);
        });
    }    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        arr.forEach(ps -> {
            builder.append(ps);
            builder.append("\n");
        });        
        return builder.toString();
    }        
}

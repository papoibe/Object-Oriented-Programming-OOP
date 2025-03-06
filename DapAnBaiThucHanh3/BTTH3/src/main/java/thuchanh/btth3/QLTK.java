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
public class QLTK {
    private ArrayList<TaiKhoan> arr = new ArrayList<>();

    public ArrayList<TaiKhoan> getArr() {
        return arr;
    }

    public void setArr(ArrayList<TaiKhoan> arr) {
        this.arr = arr;
    }
    
    public void themTK(TaiKhoan tk) {
        arr.add(tk);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        arr.forEach(t -> builder.append(t));
        return builder.toString();
    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BTTH.Bai2;

/**
 *
 * @author admin
 */
public class BaiTap7 {
    public static void main(String[] args) {
        OlympicTokyo ds = new OlympicTokyo(
                "D:\\NetBeansProjects\\Bai2\\app\\src\\main\\resources\\Top20TokyoInfo.txt", 
                "D:\\NetBeansProjects\\Bai2\\app\\src\\main\\resources\\Top20Tokyo.txt"
        );
//        ds.timKiemTenQG("ba lan");
//        ds.timKiemTheoV(20);
        ds.inQuocGia("My", "D:\\NetBeansProjects\\Bai2\\app\\src\\main\\resources\\USA.txt");
    }
}

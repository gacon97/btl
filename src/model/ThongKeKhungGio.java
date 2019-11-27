/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author Anh Le
 */
public class ThongKeKhungGio extends KhungGio{
    int tong_luot;
    int tong_tien;

    public ThongKeKhungGio(Time gioBatDau, Time gioKetThuc) {
        super(gioBatDau, gioKetThuc);
    }

    public ThongKeKhungGio(int tong_luot, int tong_tien, Time gioBatDau, Time gioKetThuc) {
        super(gioBatDau, gioKetThuc);
        this.tong_luot = tong_luot;
        this.tong_tien = tong_tien;
    }

    public int getTong_luot() {
        return tong_luot;
    }

    public int getTong_tien() {
        return tong_tien;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public Time getGioKetThuc() {
        return gioKetThuc;
    }

    public void setTong_luot(int tong_luot) {
        this.tong_luot = tong_luot;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public void setGioKetThuc(Time gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }
    
    
}

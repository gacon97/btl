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
public class KhungGio {
    Time gioBatDau;
    Time gioKetThuc;

    public KhungGio(Time gioBatDau, Time gioKetThuc) {
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public Time getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public void setGioKetThuc(Time gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }
    
    
}

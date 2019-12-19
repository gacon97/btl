/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author ngona
 */
public class PhieuCheckout {
    public Time gioNhan;
    public Time gioTra;
    public int id;
    public NhanVien nhanVien;
    public PhieuDatSan phieuDatSan;

    public PhieuCheckout(Time gioNhan, Time gioTra, int id, NhanVien nhanVien, PhieuDatSan phieuDatSan) {
        this.gioNhan = gioNhan;
        this.gioTra = gioTra;
        this.id = id;
        this.nhanVien = nhanVien;
        this.phieuDatSan = phieuDatSan;
    }

    public Time getGioNhan() {
        return gioNhan;
    }

    public Time getGioTra() {
        return gioTra;
    }

    public int getId() {
        return id;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public PhieuDatSan getPhieuDatSan() {
        return phieuDatSan;
    }

    public void setGioNhan(Time gioNhan) {
        this.gioNhan = gioNhan;
    }

    public void setGioTra(Time gioTra) {
        this.gioTra = gioTra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setPhieuDatSan(PhieuDatSan phieuDatSan) {
        this.phieuDatSan = phieuDatSan;
    }
    
    
}

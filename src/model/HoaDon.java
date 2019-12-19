/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ngona
 */
public class HoaDon {
    public PhieuDatSan phieuDatSan;
    public Date ngayThanhToan;
    public int tienThanhToan;
    public NhanVien nhanVien;

    public HoaDon(PhieuDatSan phieuDatSan, int tienThanhToan) {
        this.phieuDatSan = phieuDatSan;
        this.tienThanhToan = tienThanhToan;
    }

    public PhieuDatSan getPhieuDatSan() {
        return phieuDatSan;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public int getTienThanhToan() {
        return tienThanhToan;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setPhieuDatSan(PhieuDatSan phieuDatSan) {
        this.phieuDatSan = phieuDatSan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public void setTienThanhToan(int tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
}

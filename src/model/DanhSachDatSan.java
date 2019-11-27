/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Anh Le
 */
public class DanhSachDatSan {

    public int id;
    public KhungGio khungGio;
    public KhachHang khachHang;
    public SanBong sanBong;
    public Date ngayBatDau;
    public Date ngayKetThuc;
    public int tongTien;

    public DanhSachDatSan(int id, KhungGio khungGio, KhachHang khachHang, SanBong sanBong, Date ngayBatDau, Date ngayKetThuc, int tongTien) {
        this.id = id;
        this.khungGio = khungGio;
        this.khachHang = khachHang;
        this.sanBong = sanBong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tongTien = tongTien;
    }

    public int getTongTien() {
        return tongTien;
    }


    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public int getId() {
        return id;
    }

    public KhungGio getKhungGio() {
        return khungGio;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public SanBong getSanBong() {
        return sanBong;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKhungGio(KhungGio khungGio) {
        this.khungGio = khungGio;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setSanBong(SanBong sanBong) {
        this.sanBong = sanBong;
    }

}

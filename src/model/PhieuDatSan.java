/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Anh Le
 */
public class PhieuDatSan {

    public int id;
    public KhungGio khungGio;
    public KhachHang khachHang;
    public SanBong sanBong;
    public ArrayList<PhieuCheckout> PhieuCheckout;
    public Date ngayBatDau;
    public Date ngayKetThuc;
    public int tongTien;

    public PhieuDatSan(int id, KhungGio khungGio, KhachHang khachHang, SanBong sanBong, Date ngayBatDau, Date ngayKetThuc) {
        this.id = id;
        this.khungGio = khungGio;
        this.khachHang = khachHang;
        this.sanBong = sanBong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public void setPhieuCheckout(ArrayList<PhieuCheckout> PhieuCheckout) {
        this.PhieuCheckout = PhieuCheckout;
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

    public long tongTien() {
        long diffInMillies = Math.abs(this.ngayKetThuc.getTime() - this.ngayBatDau.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff * this.sanBong.getGia();
    }
    public long tongLuot() {
        long diffInMillies = Math.abs(this.ngayKetThuc.getTime() - this.ngayBatDau.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }

}

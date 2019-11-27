/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anh Le
 */
public class SanBong {
    public String ten;
    public int chieuDai;
    public int chieuRong;
    public int gia;
    public String diaDiem;

    public SanBong(String ten, int chieuDai, int chieuRong, int gia, String diaDiem) {
        this.ten = ten;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.gia = gia;
        this.diaDiem = diaDiem;
    }

    public SanBong(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }
    
    

    public String getTen() {
        return ten;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public int getGia() {
        return gia;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
    
}

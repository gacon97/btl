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
public class KhachHang {
    public String cmt;
    public String ten;
    public String soDT;
    public String email;

    public KhachHang(String cmt, String ten, String soDT, String email) {
        this.cmt = cmt;
        this.ten = ten;
        this.soDT = soDT;
        this.email = email;
    }

    public KhachHang(String cmt, String ten) {
        this.cmt = cmt;
        this.ten = ten;
    }
    

    public String getCmt() {
        return cmt;
    }

    public String getTen() {
        return ten;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}

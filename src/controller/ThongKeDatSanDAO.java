/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PhieuDatSan;
import model.KhachHang;
import model.KhungGio;
import model.SanBong;
import model.ThongKeKhungGio;

/**
 *
 * @author Anh Le
 */
public class ThongKeDatSanDAO {
    public int seachKhungGio(String GioBatDau, String GioKetThuc) {
        int id = 0;
        String query = "select * from tblKhungGio where GioBatDau = '" + GioBatDau + "' and GioKetThuc = '" + GioKetThuc + "'";
        Statement stmt;
        try {
            stmt = DAO.getInstance().con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(query).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public ArrayList<PhieuDatSan> getDanhSach(int idKhungGio, String ngayBD, String ngayKT) {
        ArrayList<PhieuDatSan> dsDatSan = new ArrayList<>();
        String query = "SELECT tblPhieuDatSan.*, tblKhachHang.SoCMT,tblNguoi.HoTen, tblSanBong.Ten, tblSanBong.GiaTien,tblKhungGio.GioBatDau, tblKhungGio.GioKetThuc "
                + "from tblPhieuDatSan INNER JOIN tblKhungGio ON tblPhieuDatSan.KhungGio_ID = tblKhungGio.id "
                + "INNER JOIN tblKhachHang ON tblPhieuDatSan.KhachHang_ID = tblKhachHang.id "
                + "INNER JOIN tblNguoi ON tblNguoi.id = tblKhachHang.Nguoi_ID "
                + "INNER JOIN tblSanBong on tblSanBong.id = tblPhieuDatSan.SanBong_ID "
                + "INNER JOIN tblHoaDon ON tblHoaDon.PhieuDatSan_ID = tblPhieuDatSan.id "
                + "INNER JOIN tblPhieuCheckout ON tblPhieuDatSan.id = tblPhieuCheckout.PhieuDatSan_ID "
                + "where tblPhieuDatSan.NgayBatDau >= '" + ngayBD + "' and tblPhieuDatSan.NgayKetThuc <= '" + ngayKT + "' AND tblKhungGio.id = " + idKhungGio + "";
        System.out.println(query);
        Statement stmt;
        try {
            stmt = DAO.getInstance().con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                SanBong sanBong = new SanBong(rs.getString("Ten"), rs.getInt("GiaTien"));
                KhachHang khachHang = new KhachHang(rs.getString("SoCMT"), rs.getString("HoTen"));
                KhungGio khungGio = new KhungGio(rs.getTime("GioBatDau"), rs.getTime("GioKetThuc"));
                PhieuDatSan danhSachDatSan = new PhieuDatSan(rs.getInt("id"), khungGio, khachHang, sanBong, rs.getDate("NgayBatDau"), rs.getDate("NgayKetThuc"));
                dsDatSan.add(danhSachDatSan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query).log(Level.SEVERE, null, ex);
        }
        return dsDatSan;
    }
    
}

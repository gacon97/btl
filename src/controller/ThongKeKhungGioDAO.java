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
import model.TaiKhoan;
import model.ThongKeKhungGio;

/**
 *
 * @author Anh Le
 */
public class ThongKeKhungGioDAO {

    public ArrayList<ThongKeKhungGio> nhapKhungGio(String NgayBatDau, String NgayKetThuc) {
        ArrayList<ThongKeKhungGio> tkKhungGio = new ArrayList<>();
        String query = "SELECT tblKhungGio.GioBatDau, tblKhungGio.GioKetThuc,COUNT(tblPhieuDatSan.id) AS tong_luot, "
                        + "SUM(tblPhieuDatSan.TongTien) AS tong_tien from tblPhieuDatSan \n" +
                        "INNER JOIN tblKhungGio ON tblPhieuDatSan.KhungGio_ID = tblKhungGio.id \n" +
                        "INNER JOIN tblHoaDon ON tblHoaDon.PhieuDatSan_ID = tblPhieuDatSan.id\n" +
                        "INNER JOIN tblPhieuCheckout ON tblPhieuDatSan.id = tblPhieuCheckout.PhieuDatSan_ID "+
                        "where tblPhieuDatSan.NgayBatDau >= '" + NgayBatDau + "' and tblPhieuDatSan.NgayKetThuc <= '" + NgayKetThuc + "' \n" +
                        "GROUP BY tblPhieuDatSan.KhungGio_ID ORDER BY tong_luot desc,tong_tien desc;";
        Statement stmt;
        System.out.println(query);
        try {
            stmt = DAO.getInstance().con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                ThongKeKhungGio tk = new ThongKeKhungGio(rs.getInt("tong_luot"), rs.getInt("tong_tien"), rs.getTime("GioBatDau"),rs.getTime("GioKetThuc"));
                tkKhungGio.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query).log(Level.SEVERE, null, ex);
        }
        return tkKhungGio;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TaiKhoan;

/**
 *
 * @author Anh Le
 */
public class NhapThoiGianController {
        public boolean nhapKhungGio(String NgayBatDau, String NgayKetThuc) {
        String query = "select * from tblPhieuDatSan where NgayBatDau >= '" + NgayBatDau + "' and NgayKetThuc <= '" + NgayKetThuc + "'";
            System.out.println(query);
        Statement stmt;
        try {
            stmt = DAO.getInstance().con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

               
            while (rs.next()) {
                int id = rs.getInt("id");
                System.out.println(id);
//                System.out.format("%s, %s, %s\n", id, name, username);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

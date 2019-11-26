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
public class LoginController {

    public boolean checkLogin(TaiKhoan tk) {
        String query = "select * from tblTaiKhoan where Username = '" + tk.getUsername() + "' and Password = '" + tk.getPassword() + "'";
        Statement stmt;
        try {
            stmt = DAO.getInstance().con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(query).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

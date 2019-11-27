/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anh Le
 */
public class DAO {

    public Connection con;
    private String url = "jdbc:mysql://192.168.10.10/btl?useUnicode=true&characterEncoding=utf-8";
    private String user = "homestead";
    private String password = "secret";
   private static final DAO instance = new DAO();

   //private constructor to avoid client applications to use constructor

   public static DAO getInstance(){
       return instance;
   }
    private DAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found.");
        } catch (SQLException e) {
            System.out.println("Error connection!");
        }
    }

    public Connection getConnection() {

        return con;
    }
}

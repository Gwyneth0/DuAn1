/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author thaip
 */
public class JdbcHelper {
    
    static String dburl = "jdbc:sqlserver://localhost;database=QLTKNH";
    static String user = "sa";
    static String pass = "teonao";

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql);
        }else{
            stmt = conn.prepareStatement(sql);
        }for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... args) throws SQLException {
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs.next()){
                return rs.getObject(1);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int update(String sql, Object... args) throws SQLException {
        try {
            PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            }finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**Test */
    // public static void main(String[] args) {
    //     String sql = "select * from NguoiHoc where MaNH = ?";
    //     String sql1 = "select count(*) from NhanVien";
    //     String sql2 = "insert ChuyenDe values (?,?,?,?,?,?)";
    //     try {
    //         // ResultSet rs = JdbcHelper.query(sql, "PS02771");
    //         // while (rs.next()) {
    //         //     System.out.println(rs.getObject(1));
    //         // }
    //         // --------------------------
    //         // String ma = (String) JdbcHelper.value(sql, "PS02771");
    //         // System.out.println(ma);
    //         //---------------------------
    //         JdbcHelper.update(sql2, "Toan","Toan",000,00,"Toan.png","Toan");
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }
}

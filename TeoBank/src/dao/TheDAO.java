/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.The;
import utils.JdbcHelper;

/**
 *
 * @author thai
 */
public class TheDAO {

    String update_sql = "update The set soTien = ? where soTaiKhoan = ?";
    String selectAll_sql = "select * from The";
    String selectById_sql = "select * from The where soTaiKhoan = ?";

    public void update(The entity) {
        try {
            JdbcHelper.update(update_sql, entity.getSoTien(), entity.getSoTaiKhoan());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public The selectById(String key) {
        List<The> list = this.selectBySql(selectById_sql, key);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    protected List<The> selectBySql(String sql, Object... args) {
        List<The> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                The the = new The();
                the.setSoTaiKhoan(rs.getString("soTaiKhoan")) ;
                the.setSoTien(rs.getFloat("soTien"));
                the.setPin(rs.getInt("pin"));
                list.add(the);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

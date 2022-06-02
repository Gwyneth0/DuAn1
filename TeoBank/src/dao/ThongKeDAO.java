/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.*;

import utils.JdbcHelper;

/**
 *
 * @author thaip
 */
public class ThongKeDAO {
    private String selectByYear_sql = "select maLichSu, soTaiKhoan, soTien, ngGiaoDich, tenLoai from LichSu where year(ngGiaoDich) = ?";
    private String selectYearDK_sql = "select year(ngGiaoDich) from LichSu group by year(ngGiaoDich) order by year(ngGiaoDich) desc";
    
    public List<Integer> selectYear(){
        return selectYearDK(selectYearDK_sql);
    }
    public List<Object[]> selectByYear(int year){
        String[] cols = {"Mã Giao Dịch", "Số Tài Khoản", "Số Tiền", "Ngày Giao Dịch", "Loai"};
        return getListOfArray(selectByYear_sql, cols, year);
    }
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] row = new Object[cols.length];
                for (int i = 0; i < row.length; i++) {
                    row[i] = rs.getObject(i+1);
                }
                list.add(row); 
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private List<Integer> selectYearDK(String sql, Object... args){
        List<Integer> list = new ArrayList<Integer>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.JdbcHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.LichSu;

/**
 *
 * @author thai
 */
public class LichSuDAO {
    String insert_sql = "insert LichSu (tenLoai, nguoiGiaoDich, ngGiaoDich, soTaiKhoan, soTien, ghiChu) values (?,?,?,?,?,?)";
    String selectAll_sql = "select * from LichSu";

    public void insert(LichSu entity) {
        try {
            JdbcHelper.update(insert_sql, entity.getTenLoai(), entity.getNguoiGiaoDich(), entity.getNgayGiaoDich(), entity.getSoTaiKhoan(), entity.getSoTien(), entity.getGhiChu());
        } catch (Exception e) {}
    }
    public List<LichSu> selectAll(){
        return selectBySql(selectAll_sql);
    }
    protected List<LichSu> selectBySql(String sql, Object... args){
        List<LichSu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                LichSu lichSu = new LichSu();
                lichSu.setMaLichSu(rs.getInt("maLichSu"));
                lichSu.setTenLoai(rs.getString("tenLoai"));
                lichSu.setNguoiGiaoDich(rs.getString("nguoiGiaoDich"));
                lichSu.setNgayGiaoDich(rs.getString("ngGiaoDich"));
                lichSu.setSoTaiKhoan(rs.getString("soTaiKhoan"));
                lichSu.setSoTien(rs.getFloat("soTien"));
                lichSu.setGhiChu(rs.getString("ghiChu"));
                list.add(lichSu);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

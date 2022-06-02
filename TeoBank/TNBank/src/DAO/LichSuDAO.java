/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.LichSu;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class LichSuDAO extends TNBankDAO<LichSu, String> {

    String insert_sql = "insert LichSu (tenLoai, nguoiGiaoDich, ngGiaoDich, soTaiKhoan, soTien, ghiChu) values (?,?,?,?,?,?)";
    String selectAll_sql = "select * from LichSu";

    @Override
    public void insert(LichSu entity) {
        XJdbc.update(insert_sql,
                entity.getTenLoai(),
                entity.getNguoiGiaoDich(),
                entity.getNgayGiaoDich(),
                entity.getSoTaiKhoan(),
                entity.getSoTien(),
                entity.getGhiChu());
    }

    @Override
    public void update(LichSu entity) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public LichSu selectById(String id) {
        return null;
    }

    @Override
    public List<LichSu> selectAll() {
        return selectBySql(selectAll_sql);
    }

    @Override
    protected List<LichSu> selectBySql(String sql, Object... args) {
        List<LichSu> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                LichSu lichSu = new LichSu();
                lichSu.setMaLichSu(rs.getInt("maLichSu"));
                lichSu.setTenLoai(rs.getString("tenLoai"));
                lichSu.setNguoiGiaoDich(rs.getString("nguoiGiaoDich"));
                lichSu.setNgayGiaoDich(rs.getString("ngGiaoDich"));
                lichSu.setSoTaiKhoan(String.valueOf(rs.getInt("soTaiKhoan")));
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

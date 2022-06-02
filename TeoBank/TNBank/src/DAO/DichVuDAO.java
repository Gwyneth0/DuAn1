/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.DichVu;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class DichVuDAO extends TNBankDAO<DichVu, String> {

    String INSERT_SQL = "INSERT INTO DichVu (soTaiKhoan, maLoai, maCungCap, ngayDK, tenDV, nhaCungCap, soTien, noiDung) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public void insert(DichVu entity) {
        XJdbc.update(INSERT_SQL,
                entity.getSoTaiKhoan(),
                entity.getMaLoai(),
                entity.getMaCungCap(),
                entity.getNgayDK(),
                entity.getTenDV(),
                entity.getNhaCungCap(),
                entity.getSoTien(),
                entity.getNoiDung());
    }

    @Override
    public void update(DichVu entity) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public DichVu selectById(String id) {
        return null;
    }

    @Override
    public List<DichVu> selectAll() {
        String sql = "SELECT * FROM DichVu";
        return selectBySql(sql);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    DichVu entity = new DichVu();
                    entity.setMaDV(rs.getInt("MaDV"));
                    entity.setSoTaiKhoan(rs.getInt("soTaiKhoan"));
                    entity.setMaLoai(rs.getString("maLoai"));
                    entity.setMaCungCap(rs.getString("maCungCap"));
                    entity.setNgayDK(rs.getDate("ngayDK"));
                    entity.setTenDV(rs.getString("tenDV"));
                    entity.setNhaCungCap(rs.getString("nhaCungCap"));
                    entity.setSoTien(rs.getDouble("soTien"));
                    entity.setNoiDung(rs.getString("noiDung"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public DichVu selectByDichVu() {
        String sql = "select top 1 * from DichVu order by maDV desc";
        List<DichVu> list = selectBySql(sql);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Object> selectIdBySql(String sql, Object... args) {
        List<Object> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                list.add(rs.getObject(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object> selectYear() {
        String sql = "select year(ngayDK) from DichVu group by year(ngayDK) order by year(ngayDK) desc";
        return selectIdBySql(sql);
    }

    public List<DichVu> selectByYearNhaCungCap(String maloai, String year) {
        String sql = "select * from DichVu where maLoai = ? and year(ngayDK) = ?";
        return selectBySql(sql, maloai, year);
    }

}

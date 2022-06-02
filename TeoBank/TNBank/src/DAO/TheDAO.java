/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.The;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class TheDAO extends TNBankDAO<The, String> {

    String INSERT_SQL = "INSERT INTO The (soCMND, hoTen, ngayDK, ngayHetHan, soTien, maNV, khoa, internet, pin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE The SET soCMND=?, hoTen=?, ngayDK=?, ngayHetHan=?, soTien=?, maNV=?, khoa =?, internet =?, pin=? WHERE soTaiKhoan=?";
    String DELETE_SQL = "DELETE FROM The WHERE soTaiKhoan=?";
    String SELECT_ALL_SQL = "SELECT * FROM The";
    String SELECT_BY_ID_SQL = "SELECT * FROM The WHERE soTaiKhoan=?";

    @Override
    public void insert(The entity) {
        XJdbc.update(INSERT_SQL,
                entity.getSoCMND(),
                entity.getHoTen(),
                entity.getNgayDK(),
                entity.getNgayHetHan(),
                entity.getSoTien(),
                entity.getMaNV(),
                entity.getKhoa(),
                entity.getInternet(),
                entity.getPin());
    }

    @Override
    public void update(The entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getSoCMND(),
                entity.getHoTen(),
                entity.getNgayDK(),
                entity.getNgayHetHan(),
                entity.getSoTien(),
                entity.getMaNV(),
                entity.getKhoa(),
                entity.getInternet(),
                entity.getPin(),
                entity.getSoTaiKhoan());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public The selectById(String id) {
        List<The> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public The selectById(Integer id) {
        List<The> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<The> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<The> selectBySql(String sql, Object... args) {
        List<The> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            //tạo vòng lặp add dữ liệu từ ResultSet vào list
            while (rs.next()) {
                The entity = new The();
                entity.setSoTaiKhoan(rs.getInt("soTaiKhoan"));
                entity.setSoCMND(rs.getString("soCMND"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setNgayDK(rs.getDate("ngayDK"));
                entity.setNgayHetHan(rs.getDate("ngayHetHan"));
                entity.setSoTien(rs.getFloat("soTien"));
                entity.setMaNV(rs.getString("maNV"));
                entity.setKhoa(rs.getBoolean("khoa"));
                entity.setInternet(rs.getBoolean("internet"));
                entity.setPin(rs.getInt("pin"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void khoa(The entity) {
        String sql = "UPDATE The SET khoa=? WHERE soTaiKhoan=?";
        XJdbc.update(sql,
                entity.getKhoa(),
                entity.getSoTaiKhoan());
    }

    public List<The> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM The WHERE hoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<The> selectByIdTK(String nam) {
        String sql = "select * from The where year(ngayDK) = ?";
        List<The> list = selectBySql(sql, nam);
        return list;
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
        String sql = "select year(ngayDK) from The group by year(ngayDK) order by year(ngayDK) desc";
        return selectIdBySql(sql);
    }

}

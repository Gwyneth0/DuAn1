/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.TaiKhoan;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class TaiKhoanDAO extends TNBankDAO<TaiKhoan, String> {

    String INSERT_SQL = "INSERT INTO TaiKhoan (MaNV, MatKhau, VaiTro) VALUES (?, ?, ?)";
    String UPDATE_SQL = "UPDATE TaiKhoan SET MatKhau=?, VaiTro=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM TaiKhoan WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM TaiKhoan";
    String SELECT_BY_ID_SQL = "SELECT * FROM TaiKhoan WHERE MaNV=?";

    @Override
    public void insert(TaiKhoan entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getMatKhau(),
                entity.getVaiTro());
    }

    @Override
    public void update(TaiKhoan entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getMatKhau(),
                entity.getVaiTro(),
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public TaiKhoan selectById(String id) {
        List<TaiKhoan> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            //tạo vòng lặp add dữ liệu từ ResultSet vào list
            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setMaNV(rs.getString("maNV"));
                entity.setMatKhau(rs.getString("matKhau"));
                entity.setVaiTro(rs.getBoolean("vaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

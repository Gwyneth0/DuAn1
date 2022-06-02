/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.LoaiDichVu;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class LoaiDichVuDAO extends TNBankDAO<LoaiDichVu, String> {

    String SELECT_ALL_SQL = "SELECT * FROM LoaiDichVu";

    @Override
    public void insert(LoaiDichVu entity) {
    }

    @Override
    public void update(LoaiDichVu entity) {

    }

    @Override
    public void delete(String id) {
    }

    @Override
    public LoaiDichVu selectById(String id) {
        return null;
    }

    @Override
    public List<LoaiDichVu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiDichVu> selectBySql(String sql, Object... args) {
        List<LoaiDichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    LoaiDichVu entity = new LoaiDichVu();
                    entity.setMaLoai(rs.getString("maLoai"));
                    entity.setTenDV(rs.getString("tenDV"));
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
}

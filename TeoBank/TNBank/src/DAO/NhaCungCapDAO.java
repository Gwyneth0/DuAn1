/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.NhaCungCap;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class NhaCungCapDAO extends TNBankDAO<NhaCungCap, String> {

    String SELECT_ALL_SQL = "SELECT * FROM NhaCungCap";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhaCungCap WHERE maCungCap=?";

    @Override
    public void insert(NhaCungCap entity) {

    }

    @Override
    public void update(NhaCungCap entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public NhaCungCap selectById(String id) {
        List<NhaCungCap> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhaCungCap entity = new NhaCungCap();
                    entity.setMaCungCap(rs.getString("maCungCap"));
                    entity.setMaLoai(rs.getString("maloai"));
                    entity.setNhaCungCap(rs.getString("nhaCungCap"));
                    entity.setSoTien(rs.getDouble("soTien"));
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

    public List<NhaCungCap> selectByLoaiDichVu(String maLoai) {
        String sql = "SELECT * FROM NhaCungCap WHERE maLoai=?";
        return selectBySql(sql, maLoai);
    }

    protected List<NhaCungCap> selectSoTienBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhaCungCap entity = new NhaCungCap();
                    entity.setMaCungCap(rs.getString("maCungCap"));
                    entity.setSoTien(rs.getDouble("soTien"));
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

    public List<NhaCungCap> selectSoTienByNhaCungCap(String maCungCap) {
        String sql = "select soTien from NhaCungCap where maCungCap = ?;";
        return selectSoTienBySql(sql, maCungCap);
    }

}

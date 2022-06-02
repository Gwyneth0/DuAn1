/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.NhanVien;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class NhanVienDAO extends TNBankDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (maNV, hoTen, ngaySinh, soCMND, dienThoai, diaChi, hinh) VALUES (?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NhanVien SET hoTen=?, ngaySinh=?, soCMND=?, dienThoai=?, diaChi=?, hinh=? WHERE maNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE maNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE maNV=?";

    @Override
    public void insert(NhanVien entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getSoCMND(),
                entity.getDienThoai(),
                entity.getDiaChi(),
                entity.getHinh());
    }

    @Override
    public void update(NhanVien entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getSoCMND(),
                entity.getDienThoai(),
                entity.getDiaChi(),
                entity.getHinh(),
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            //tạo vòng lặp add dữ liệu từ ResultSet vào list
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("maNV"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setSoCMND(rs.getString("soCMND"));
                entity.setDienThoai(rs.getString("dienThoai"));
                entity.setDiaChi(rs.getString("diaChi"));
                entity.setHinh(rs.getString("hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE hoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public NhanVien selectByCaiDat(String id) {
        String sql = "select maNV, hoTen, NgaySinh, soCMND, dienThoai, diaChi, hinh from NhanVien where maNV LIKE ?";
        List<NhanVien> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

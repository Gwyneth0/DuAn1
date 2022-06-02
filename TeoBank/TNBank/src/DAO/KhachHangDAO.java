/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.KhachHang;
import Utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietm
 */
public class KhachHangDAO extends TNBankDAO<KhachHang, String> {

    String INSERT_SQL = "INSERT INTO KhachHang (soCMND, hoTen, ngaySinh, ngayDK, dienThoai, gmail, diaChi, hinh) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE KhachHang SET hoTen=?, ngaySinh=?, ngayDK=?, dienThoai=?, gmail=?, diaChi=?, hinh=? WHERE soCMND=?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE soCMND=?";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE soCMND=?";

    @Override
    public void insert(KhachHang entity) {
        XJdbc.update(INSERT_SQL,
                entity.getSoCMND(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getNgayDK(),
                entity.getDienThoai(),
                entity.getGmail(),
                entity.getDiaChi(),
                entity.getHinh());
    }

    @Override
    public void update(KhachHang entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getNgayDK(),
                entity.getDienThoai(),
                entity.getGmail(),
                entity.getDiaChi(),
                entity.getHinh(),
                entity.getSoCMND());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            //tạo vòng lặp add dữ liệu từ ResultSet vào list
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setSoCMND(rs.getString("soCMND"));
                entity.setHoTen(rs.getString("hoTen"));
                entity.setNgaySinh(rs.getDate("ngaySinh"));
                entity.setNgayDK(rs.getDate("ngayDK"));
                entity.setDienThoai(rs.getString("dienThoai"));
                entity.setGmail(rs.getString("gmail"));
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

    public List<KhachHang> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM Khachhang WHERE hoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public KhachHang selectMaKHBySoTK(String soTK) {
        String sql = "select KhachHang.soCMND, KhachHang.hoTen, ngaySinh,KhachHang.ngayDK, dienThoai, gmail , diaChi,hinh from KhachHang inner join The on KhachHang.soCMND = The.soCMND where soTaiKhoan = ?";
        List<KhachHang> list = selectBySql(sql, soTK);
        return list.size() > 0 ? list.get(0) : null;
    }

    public KhachHang selectByKhoaThe(String id) {
        String sql = "select KhachHang.dienThoai, KhachHang.gmail, The.hoTen, ngaySinh, KhachHang.ngayDK, diaChi, hinh, The.soCMND from KhachHang inner join The on KhachHang.soCMND = The.soCMND where soTaiKhoan = ?";
        List<KhachHang> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.HoaDon;
import Utils.XJdbc;

/**
 *
 * @author vietm
 */
public class HoaDonDAO {

    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (maDV, soCMND, soTaiKhoan, ngayThanhToan, soTien, tenDV, nhaCungCap, noiDung) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaDV(),
                model.getSoCMND(),
                model.getSoTaiKhoan(),
                model.getNgayThanhToan(),
                model.getSoTien(),
                model.getTenDV(),
                model.getNhaCungCap(),
                model.getNoiDung());
    }
}

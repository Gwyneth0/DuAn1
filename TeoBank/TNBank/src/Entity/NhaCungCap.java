/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author vietm
 */
public class NhaCungCap {

    String maCungCap;
    String maLoai;
    String nhaCungCap;
    double soTien;

    @Override
    public String toString() {
        return this.nhaCungCap;
    }

    public String getMaCungCap() {
        return maCungCap;
    }

    public void setMaCungCap(String maCungCap) {
        this.maCungCap = maCungCap;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
}

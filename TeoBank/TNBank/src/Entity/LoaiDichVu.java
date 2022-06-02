/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author vietm
 */
public class LoaiDichVu {

    String maLoai;
    String tenDV;

    @Override
    public String toString() {
        return this.tenDV;
    }

    @Override
    public boolean equals(Object obj) {
        LoaiDichVu other = (LoaiDichVu) obj;
        return other.getMaLoai().equals(this.getMaLoai());
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.join.model;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {

    private int id;

    private String tenSinhVien;

    private int gioiTinh;

    private LopHoc lopHoc;

    public SinhVien() {
    }

    public SinhVien(int id, String tenSinhVien, int gioiTinh, LopHoc lopHoc) {
        this.id = id;
        this.tenSinhVien = tenSinhVien;
        this.gioiTinh = gioiTinh;
        this.lopHoc = lopHoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", tenSinhVien=" + tenSinhVien + ", gioiTinh=" + gioiTinh + ", TenLop=" + lopHoc.getTenLop() + '}';
    }

}

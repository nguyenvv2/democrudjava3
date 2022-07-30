/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.join.repository;

import democrud.join.model.LopHoc;
import democrud.join.model.SinhVien;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    private DBConnection connection;

    public ArrayList<SinhVien> getListFromDb() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        String sql = " SELECT sinh_vien.id, sinh_vien.ten_sinh_vien, sinh_vien.gioi_tinh, lop_hoc.ten_lop "
                + " FROM sinh_vien join lop_hoc \n"
                + " on sinh_vien.id_lop = lop_hoc.id_lop ";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SinhVien sv = new SinhVien();

                sv.setId(rs.getInt(1));
                sv.setTenSinhVien(rs.getString(2));
                sv.setGioiTinh(rs.getInt(3));

                LopHoc lopHoc = new LopHoc();
                lopHoc.setTenLop(rs.getString(4));
                sv.setLopHoc(lopHoc);

                listSinhVien.add(sv);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listSinhVien;
    }

    public Boolean addNew(SinhVien sinhVien) {
        String query = "insert into sinh_vien values (?,?,?) ";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sinhVien.getTenSinhVien());
            ps.setObject(2, sinhVien.getGioiTinh());
            ps.setObject(3, sinhVien.getLopHoc().getIdLop());
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        SinhVienRepository sinhVienRepository = new SinhVienRepository();
        ArrayList<SinhVien> list = sinhVienRepository.getListFromDb();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }

        String ten = "nguyen van B";
        int gioiTinh = 1;
        int maLop = 1;
        SinhVien sinhVien = new SinhVien();
        sinhVien.setTenSinhVien(ten);
        sinhVien.setGioiTinh(gioiTinh);

        LopHoc lopHoc = new LopHoc();
        lopHoc.setIdLop(maLop);
        sinhVien.setLopHoc(lopHoc);
        sinhVienRepository.addNew(sinhVien);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.join.model;

/**
 *
 * @author nguyenvv
 */
public class LopHoc {

    private int idLop;

    private String maLop;

    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(int idLop, String maLop, String tenLop) {
        this.idLop = idLop;
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public int getIdLop() {
        return idLop;
    }

    public void setIdLop(int idLop) {
        this.idLop = idLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

}

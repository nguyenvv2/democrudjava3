/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.model;

/**
 *
 * @author nguyenvv
 */
public class Account {
    
    private int id;
    
    private String taiKhoan;
    
    private String matKhau;

    public Account() {
    }

    public Account(int id, String taiKhoan, String matKhau) {
        this.id = id;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + '}';
    }
    
    
    
}

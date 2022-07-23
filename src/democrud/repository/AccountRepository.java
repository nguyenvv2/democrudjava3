/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.repository;

import democrud.model.Account;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

/**
 *
 * @author nguyenvv
 */
public class AccountRepository {

    private DBConnection connection;

    public ArrayList<Account> getListFromDb() {
        ArrayList<Account> listAccount = new ArrayList<>();
        String sql = " Select account.id, account.tai_khoan, account.mat_khau "
                + " From account ";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setTaiKhoan(rs.getString(2));
                account.setMatKhau(rs.getString(3));
                listAccount.add(account);
            }
        } catch (Exception e) {
        }

        return listAccount;
    }

    public Boolean addNew(Account account) {
        String query = "insert into account(tai_khoan, mat_khau) VALUES (?,?) ";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, account.getTaiKhoan());
            ps.setObject(2, account.getMatKhau());
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Boolean update(int id, Account account) {
        String query = "Update  account set tai_khoan = ?, mat_khau = ? WHERE id = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, account.getTaiKhoan());
            ps.setObject(2, account.getMatKhau());
            ps.setObject(3, id);
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Boolean xoa(int id) {

        String query = "delete account where id =?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);

            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    

}

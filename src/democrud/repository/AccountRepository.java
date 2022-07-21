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

/**
 *
 * @author nguyenvv
 */
public class AccountRepository {

    private DBConnection connection;

    public ArrayList<Account> getListFromDb() {
        ArrayList<Account> listAccount = new ArrayList<>();
        String sql = " Select account.id, account.tai_khoan, account.mat_khau "
                + " From account";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt(1));
                account.setTaiKhoan(rs.getString(2));
                account.setMatKhau(rs.getString(3));
                listAccount.add(account);

            }
        } catch (Exception e) {
        }

        return listAccount;
    }

    public static void main(String[] args) {
        ArrayList<Account> list = new AccountRepository().getListFromDb();
        for (Account account : list) {
            System.out.println(account.toString());
        }
    }

}

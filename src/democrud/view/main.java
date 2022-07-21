/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.view;

import democrud.model.Account;
import democrud.sevice.AccountService;
import democrud.sevice.impl.AccountServiceImpl;

/**
 *
 * @author nguyenvv
 */
public class main {

    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();

        for (Account acc : accountService.getList()) {
            System.out.println(acc.toString());
        }
    }

}

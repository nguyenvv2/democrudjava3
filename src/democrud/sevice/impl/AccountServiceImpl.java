/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.sevice.impl;

import democrud.model.Account;
import democrud.repository.AccountRepository;
import democrud.sevice.AccountService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository = new AccountRepository();

    @Override
    public ArrayList<Account> getList() {
        return accountRepository.getListFromDb();
    }

}

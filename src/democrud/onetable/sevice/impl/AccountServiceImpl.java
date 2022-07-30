/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democrud.onetable.sevice.impl;

import democrud.onetable.model.Account;
import democrud.onetable.repository.AccountRepository;
import democrud.onetable.sevice.AccountService;
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

    @Override
    public Boolean addNew(Account account) {
        return accountRepository.addNew(account);
    }

    @Override
    public Boolean update(int id, Account account) {
        return accountRepository.update(id, account);
    }

    @Override
    public Boolean delete(int id) {

        return accountRepository.xoa(id);
    }

}

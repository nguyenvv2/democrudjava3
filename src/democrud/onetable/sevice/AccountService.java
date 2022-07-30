/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package democrud.onetable.sevice;

import democrud.onetable.model.Account;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public interface AccountService {

    public ArrayList<Account> getList();

    public Boolean addNew(Account account);

    public Boolean update(int id, Account account);

    public Boolean delete(int id);

}

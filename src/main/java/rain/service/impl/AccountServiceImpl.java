package rain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rain.mapping.AccountMapper;
import rain.pojo.Account;
import rain.service.AccountService;


/*
 * @Kouch
 * 
 * AccountService�ӿ�ʵ���ࣻ
 */


@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountMapper accountMapper;//Dao
	
	//��
	public List<Account> findAllAccount() {
		return this.accountMapper.findAllAccount();
	}

	/*
	 * public Account findAccountById(int id) { return
	 * this.accountMapper.findAccountById(id); }
	 * 
	 * public Account findAccountByName(String account) { return
	 * this.accountMapper.findAccountByName(account); }
	 * 
	 * //�� public boolean addAccount(Account account) { return
	 * this.accountMapper.addAccount(account)>0?true:false; }
	 */
	
	//ɾ
	public void delAccount(int id) {
		
	}
	
	//��
	public boolean updateAccount(Account account) {
		return false;
	}

	

}

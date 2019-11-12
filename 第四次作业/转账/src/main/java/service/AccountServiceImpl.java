package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao ad;
	
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		ad.decreaseMoney(from, money);
		ad.increaseMoney(to, money);
	}

}

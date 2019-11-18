package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.XdlBankAccount;
import cn.xdl.mapper.XdlBankAccountDAO;

@Service("bankService")
public class XdlBankAccountService {
	@Autowired
    private  XdlBankAccountDAO   accountDao;
	
	public XdlBankAccount  login(String acc_no,String acc_password) {
		return  accountDao.findAccountByAccNoAndAccPassword(acc_no, acc_password);
	}
}

package cn.xdl.controller;



import cn.xdl.bean.XdlBankAccount;
import cn.xdl.service.XdlBankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class XdlBankAccountController {
	@Autowired
	private  XdlBankAccountService  bankService;
	@RequestMapping("/toLogin.do")
    public  String  toLogin() {
    	return "login";
    }
	@RequestMapping("/toMain.do")
    public  String  toMain() {
    	return "main";
    }
	@RequestMapping("/login.do")
	public String  login(String acc_no,String acc_password,HttpServletRequest request) {
		XdlBankAccount  account = bankService.login(acc_no, acc_password);
		if(account != null) {
		    request.getSession().setAttribute("account", account);
		    return  "redirect:toMain.do";
		}
		request.setAttribute("msg", "鐧诲綍澶辫触");
		return  "login";
	}
}

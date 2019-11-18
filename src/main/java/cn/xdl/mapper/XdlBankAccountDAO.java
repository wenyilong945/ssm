package cn.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.XdlBankAccount;

public interface XdlBankAccountDAO {
     XdlBankAccount   findAccountByAccNoAndAccPassword(
             @Param("acc_no") String acc_no,
             @Param("acc_password") String acc_password);
}

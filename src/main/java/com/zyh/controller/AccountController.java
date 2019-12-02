package com.zyh.controller;

import com.zyh.domain.Account;
import com.zyh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有账户
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户……");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }


    @RequestMapping(value = "/saveAccount")
    public void saveAccount(Account account,HttpServletResponse response,HttpServletRequest request)throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}

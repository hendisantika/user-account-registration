package com.hendisantika.useraccountregistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : user-account-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/04/18
 * Time: 05.36
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public String index() {
        return "User Account Registration. " + new Date();
    }
}


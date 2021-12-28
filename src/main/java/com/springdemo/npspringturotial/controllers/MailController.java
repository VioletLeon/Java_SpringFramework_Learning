package com.springdemo.npspringturotial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springdemo.npspringturotial.mail.MailSender;
import com.springdemo.npspringturotial.mail.MockMailSender;

@RestController
public class MailController {

  @Autowired
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String hello() {

      mailSender.send("mail@exmaple.com", "A test mail", "Body of the test mail");

      return "Mail sent";
    }





}

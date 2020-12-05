package com.project.taskandemail;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class SpringbootTaskAndEmailApplication {

    @Autowired
    JavaMailSenderImpl mailSender;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskAndEmailApplication.class, args);
    }

//    简单邮件
    @Test
    public void contextLoad(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("主题");
        simpleMailMessage.setText("内容");
//        发送对象邮箱
        simpleMailMessage.setTo("");
//        谁发送的
        simpleMailMessage.setFrom("");
        mailSender.send(simpleMailMessage);
    }

//    复杂邮件
    public void test2() throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);


        helper.setSubject("主题");
        helper.setText("<b style='color:red'>内容</b>",true);
//        发送对象邮箱
        helper.setTo("");
//        谁发送的
        helper.setFrom("");
//        上传文件
//        helper.addAttachment("文件名","文件路径");
        mailSender.send(message);
    }
}

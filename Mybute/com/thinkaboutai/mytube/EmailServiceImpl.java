package com.thinkaboutai.mytube;

public class EmailServiceImpl implements EmailService {
    public void sendEmail(User user) {
        System.out.println(user.getEmail());
    }
}

package com.windsor.springsecuritypractice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Test {

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String code = passwordEncoder.encode("1234");
        boolean matches = passwordEncoder.matches("1234",code);
        System.out.println(code);
        System.out.println(matches);

        System.out.println();

        String code2 = passwordEncoder.encode("5678");
        boolean matches2 = passwordEncoder.matches("5678",code2);
        System.out.println(code2);
        System.out.println(matches2);
    }
}

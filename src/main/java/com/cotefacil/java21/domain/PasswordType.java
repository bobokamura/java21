package com.cotefacil.java21.domain;

public class PasswordType {

    public static String create(String passwordType, String password) {
        Password passwordStrategy = new PlainTextPassword("123456");
        return switch (passwordStrategy) {
            case PlainTextPassword(String pass) -> pass;
            case SHA1Password(String passSha1) -> passSha1;
        };
    }
}

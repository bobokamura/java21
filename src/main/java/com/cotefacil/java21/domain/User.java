package com.cotefacil.java21.domain;

public record User(Long id, String email, String password, String passwordType) {
    @Override
    public String email() {
        return email;
    }
}

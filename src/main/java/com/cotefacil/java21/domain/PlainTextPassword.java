package com.cotefacil.java21.domain;

public record PlainTextPassword(String value) implements Password {

    @Override
    public boolean validade(String password) {
        return value().equals(password);
    }
}

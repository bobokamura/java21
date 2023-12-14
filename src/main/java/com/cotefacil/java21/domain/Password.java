package com.cotefacil.java21.domain;

public sealed interface Password permits PlainTextPassword, SHA1Password {
    String value();

    boolean validade(String password);
}

package com.cotefacil.java21.domain;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public record SHA1Password(String value) implements Password {

    public static SHA1Password create(final String plainPassword) {
        return new SHA1Password(hash(plainPassword));
    }

    public static SHA1Password restore(final String password) {
        return new SHA1Password(password);
    }

    @Override
    public boolean validade(final String password) {
        return value().equals(hash(password));
    }

    private static String hash(final String plainPassword) {
        return Hashing.sha1().hashString(plainPassword, StandardCharsets.UTF_8).toString();
    }
}
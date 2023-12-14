package com.cotefacil.java21.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlainTextPasswordTest {

    @Test
    void deveriaCriarPlainPassword() {
        final var expectedPassword = "123456";
        var password = new PlainTextPassword(expectedPassword);
        assertEquals(expectedPassword, password.value());
        assertTrue(password.validade(expectedPassword));
    }

    @Test
    void deveriaHashearASenha() {
        var password = SHA1Password.create("123456");

        assertNotEquals("123456", password.value());
    }
}

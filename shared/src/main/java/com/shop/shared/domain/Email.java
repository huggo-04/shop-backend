package com.shop.shared.domain;

import java.util.Objects;
import java.util.regex.Pattern;

public final class Email {

    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private final String value;

    private Email(String value) {
        if (value == null || !PATTERN.matcher(value).matches())
            throw new IllegalArgumentException("Invalid email: " + value);
        this.value = value.toLowerCase();
    }

    public static Email of(String value) {
        return new Email(value);
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Email e) && e.value.equals(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}

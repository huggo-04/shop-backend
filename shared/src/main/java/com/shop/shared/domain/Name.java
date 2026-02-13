package com.shop.shared.domain;

import java.util.Objects;

public final class Name {

    private final String value;

    private Name(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        this.value = value.trim();
    }

    public static Name of(String value) {
        return new Name(value);
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Name n) && n.value.equals(value);
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

package com.shop.shared.domain;

import java.util.Objects;

public final class Currency {

    private final String code;

    private Currency(String code) {
        if (code == null || code.length() != 3)
            throw new IllegalArgumentException("Currency must be 3 letters");
        this.code = code.toUpperCase();
    }

    public static Currency of(String code) {
        return new Currency(code);
    }

    public String code() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Currency c) && c.code.equals(code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return code;
    }
}

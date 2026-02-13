package com.shop.shared.domain;

public final class Description {

    private final String value;

    private Description(String value) {
        this.value = value == null ? "" : value.trim();
    }

    public static Description of(String value) {
        return new Description(value);
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}

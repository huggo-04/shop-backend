package com.shop.shared.domain;

import java.util.Objects;

public final class SKU {

    private final String value;

    private SKU(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("SKU cannot be empty");
        this.value = value;
    }

    public static SKU of(String value) {
        return new SKU(value.trim().toUpperCase());
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof SKU sku) && sku.value.equals(value);
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

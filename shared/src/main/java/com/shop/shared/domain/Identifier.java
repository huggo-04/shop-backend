package com.shop.shared.domain;

import java.util.Objects;
import java.util.UUID;

public abstract class Identifier {

    protected final String value;

    protected Identifier(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Identifier cannot be null or empty");
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static String random() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Identifier other))
            return false;
        return value.equals(other.value);
    }
}

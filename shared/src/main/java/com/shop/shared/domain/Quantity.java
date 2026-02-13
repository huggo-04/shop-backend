package com.shop.shared.domain;

import java.util.Objects;

public final class Quantity {

    private final int value;

    private Quantity(int value) {
        if (value < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");
        this.value = value;
    }

    public static Quantity of(int value) {
        return new Quantity(value);
    }

    public Quantity add(Quantity other) {
        return new Quantity(this.value + other.value);
    }

    public Quantity subtract(Quantity other) {
        if (other.value > this.value)
            throw new IllegalArgumentException("Insufficient quantity");
        return new Quantity(this.value - other.value);
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Quantity q) && q.value == value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

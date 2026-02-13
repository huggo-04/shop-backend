package com.shop.shared.domain;

import java.time.Instant;
import java.util.Objects;

public final class Timestamp {

    private final Instant value;

    private Timestamp(Instant value) {
        this.value = Objects.requireNonNull(value);
    }

    public static Timestamp now() {
        return new Timestamp(Instant.now());
    }

    public static Timestamp of(Instant instant) {
        return new Timestamp(instant);
    }

    public Instant value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Timestamp t) && t.value.equals(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

package org.lwjl.numbers;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Optional;

/**
 * A {@link Number} wraps any digit based value. Any values that extends {@link java.lang.Number} can be represented as a
 * {@link Number}.
 * <p>
 * In addition, this class provides basic algebraic capabilities for addition, subtraction, multiplication, and division.
 * It also includes structure type changes to convert any value to a {@link Integer}, {@link Double}, {@link Float}, and {@link Long}.
 *
 * @since 1.0
 * @author Wylan Shoemaker
 * @param <T>
 */
public class Number<T extends java.lang.Number> extends java.lang.Number implements Comparable<Number<T>>, Constable {

    private final T value;

    public Number (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Number<?> add (Number<?> other) {
        return new Number<>(getValue().floatValue() + other.getValue().floatValue());
    }

    public Number<?> subtract (Number<?> other) {
        return new Number<>(getValue().floatValue() - other.getValue().floatValue());
    }

    public Number<?> multiply (Number<?> other) {
        return new Number<>(getValue().floatValue() * other.getValue().floatValue());
    }

    public Number<?> divide (Number<?> other) {
        return new Number<>(getValue().floatValue() / other.getValue().floatValue());
    }

    /**
     * Represents a {@link Number} as an {@link Integer} value.
     * @return The value of {@link T} as an {@link Integer}.
     */
    public Number<?> asInteger() {
        return new Number<>(getValue().intValue());
    }

    /**
     * Represents a {@link Number} as a {@link Float} value.
     * @return The value of {@link T} as a {@link Float}.
     */
    public Number<?> asFloat () {
        return new Number<>(getValue().floatValue());
    }

    /**
     * Represents a {@link Number} as a {@link Long} value.
     * @return The value of {@link T} as a {@link Long}.
     */
    public Number<?> asLong () {
        return new Number<>(getValue().longValue());
    }

    /**
     * Represents a {@link Number} as a {@link Double} value.
     * @return The value of {@link T} as a {@link Double}.
     */
    public Number<?> asDouble () {
        return new Number<>(getValue().doubleValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(Number<T> o) {
        return 0;
    }

    @Override
    public int intValue() {
        return getValue().intValue();
    }

    @Override
    public long longValue() {
        return getValue().longValue();
    }

    @Override
    public float floatValue() {
        return getValue().floatValue();
    }

    @Override
    public double doubleValue() {
        return getValue().doubleValue();
    }

    @Override
    public Optional<? extends ConstantDesc> describeConstable() {
        return Optional.empty();
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}

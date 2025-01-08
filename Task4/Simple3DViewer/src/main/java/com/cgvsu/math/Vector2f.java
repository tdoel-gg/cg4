package com.cgvsu.math;

public class Vector2f {
    private float x, y;
    private static final float EPSILON = 1e-10F;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2f summ(Vector2f other) {
        return new Vector2f(this.x + other.x, this.y + other.y);
    }

    public Vector2f difference(Vector2f other) {
        return new Vector2f(this.x - other.x, this.y - other.y);
    }

    public Vector2f multiplyByScalar(float scalar) {
        return new Vector2f(this.x * scalar, this.y * scalar);
    }

    public Vector2f divByScalar(float scalar) {
        if (Math.abs(scalar) < EPSILON) {
            throw new IllegalArgumentException("Деление на ноль или очень маленький скаляр невозможно.");
        }
        return new Vector2f(this.x / scalar, this.y / scalar);
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector2f normalize() {
        float len = this.length();
        if (Math.abs(len) < EPSILON) {
            throw new ArithmeticException("Невозможно нормализовать нулевой вектор.");
        }
        return new Vector2f(this.x / len, this.y / len);
    }

    public double ScalarMul(Vector2f other) {
        return this.x * other.x + this.y * other.y;
    }
}

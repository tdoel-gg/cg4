package com.cgvsu.math;

public class Vector3f {
    public float x, y, z;
    private static final float EPSILON = 1e-10f;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector3f summ(Vector3f other) {
        return new Vector3f(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3f difference(Vector3f other) {
        return new Vector3f(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector3f multiplyByScalar(float scalar) {
        return new Vector3f(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public Vector3f divByScalar(float scalar) {
        if (Math.abs(scalar) < EPSILON) {
            throw new IllegalArgumentException("Деление на ноль или очень маленький скаляр невозможно.");
        }
        return new Vector3f(this.x / scalar, this.y / scalar, this.z / scalar);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3f normalize() {
        float len = (float) this.length();
        if (Math.abs(len) < EPSILON) {
            throw new ArithmeticException("Невозможно нормализовать нулевой вектор.");
        }
        return new Vector3f(this.x / len, this.y / len, this.z / len);
    }

    public double ScalarMul(Vector3f other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3f VectorMul(Vector3f other) {
        return new Vector3f(
                this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x
        );
    }

}

package org.example.evosuite;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public int abs(int a) {
        return Math.abs(a);
    }

    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public long factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

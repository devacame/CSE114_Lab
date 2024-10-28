// 116598178 Henry Ahn

import java.util.Scanner;

public class Rational {
    private int numerator, denominator;

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Rational(int numerator, int denominator) {
        int gcd = Rational.getGCD(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public static Rational add(Rational r1, Rational r2) {
        int n1 = r1.numerator * r2.denominator;
        int n2 = r2.numerator * r1.denominator;
        int d = r1.denominator * r2.denominator;
        int gcd = Rational.getGCD(n1 + n2, d);
        return new Rational((n1 + n2) / gcd, d / gcd);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        return Rational.add(r1, new Rational(-r2.numerator, r2.denominator));
    }

    public static Rational multipy(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.numerator;
        int denominator = r1.denominator * r2.denominator;
        int gcd = Rational.getGCD(numerator, denominator);
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public static Rational divide(Rational r1, Rational r2) {
        return Rational.multipy(r1, new Rational(r2.denominator, r2.numerator));
    }

    public void print() {
        System.out.printf("%d/%d", this.numerator, this.denominator);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a numerator for the first rational number: ");
        int n1 = ip.nextInt();
        System.out.print("Enter a denominator for the first rational number: ");
        int d1 = ip.nextInt();
        System.out.print("Enter a numerator for the second rational number: ");
        int n2 = ip.nextInt();
        System.out.print("Enter a denominator for the second rational number: ");
        int d2 = ip.nextInt();
        ip.close();
        Rational r1 = new Rational(n1, d1), r2 = new Rational(n2, d2);
        System.out.print("First rational number: ");
        r1.print();
        System.out.print("\nSecond rational number: ");
        r2.print();
        System.out.print("\nAddition of the rational numbers is: ");
        Rational.add(r1, r2).print();
        System.out.print("\nSubtraction of the rational numbers is: ");
        Rational.subtract(r1, r2).print();
        System.out.print("\nMultiplication of the rational numbers is: ");
        Rational.multipy(r1, r2).print();
        System.out.print("\nDivision of the rational numbers is: ");
        Rational.divide(r1, r2).print();
    }
}

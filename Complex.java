// 116598178 Henry Ahn

import java.util.Scanner;

public class Complex {
    private double real, imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    public void print() {
        System.out.printf("(%f, %f)", this.real, this.imaginary);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double r1, i1, r2, i2;
        System.out.print("Enter real part of the first complex number: ");
        r1 = ip.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        i1 = ip.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real part of the second complex number: ");
        r2 = ip.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        i2 = ip.nextDouble();
        Complex c2 = new Complex(r2, i2);

        ip.close();

        System.out.print("First complex number is: ");
        c1.print();
        System.out.print("\nSecond complex number is: ");
        c2.print();
        System.out.print("\nAddition of the complex numbers is: ");
        Complex.add(c1, c2).print();
        System.out.print("\nSubtraction of the complex numbers is: ");
        Complex.subtract(c1, c2).print();
    }
}

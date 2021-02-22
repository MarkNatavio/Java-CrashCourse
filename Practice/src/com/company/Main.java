package com.company;
// Create a java program that solves for the roots of a quratic formula ax^2 + bx + c
import java.util.Scanner;
import java.math.*;

public class Main {

    // [2b +/- sqrt(b^2 - 4ac)] ÷ 2a
    public static void two_roots(int a, int b, double inside){
        double first_root = ((-1*b) + Math.sqrt(inside)) / (2*a);
        double second_root = ((-1*b) - Math.sqrt(inside)) / (2*a);

        System.out.println("The first root is (" + first_root + ",0)");
        System.out.println("The second root is (" + second_root + ",0)");
    }

    public static void one_root(int a, int b){
        double only_root = ((-1*b)/(2*a));

        System.out.println("The one and only root is (" + only_root + ",0)");
    }

    public static void imaginary_roots(int a, int b, double inside){
        inside = -1 * inside;
        double first_root = ((-1*b) + Math.sqrt(inside)) / (2*a);
        double second_root = ((-1*b) - Math.sqrt(inside)) / (2*a);

        System.out.println("The first root is (" + first_root + "i,0)");
        System.out.println("The second root is (" + second_root + "i,0)");
    }

    public static void main(String[] args){
        int a;
        int b;
        int c;

        // Getting the value of a
        System.out.println("Give me the value of a");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        // Getting the value of b
        System.out.println("Give me the value of b");
        input = new Scanner(System.in);
        b = input.nextInt();

        // Getting the value of c
        System.out.println("Give me the value of c");
        input = new Scanner(System.in);
        c = input.nextInt();

        // first step, getting the type of roots
        double inside = (b*b) - (4*a*c);

        if (inside > 0){ // two real roots
            two_roots(a,b,inside);
        }else if (inside == 0){ // one real root
            one_root(a,b);
        }else{ // imaginary roots
            imaginary_roots(a,b,inside);
        }
    }
}
// Java is an Object-Oriented Programming Language (OOP) just like C++. Because of this there is a wide
// range of data manipulation.
// This include but are not limited to the creation of calsses, objects, functions, etc...
/*
    // Declaring a class
    public class class_name{...}

    // Creating an object
    class_name obj_name = new class_name();

    // Accessing a specific attribute of a class
    public class class_name {
        // Attributes - basically public variables that can be accessed anywhere within the class
        int x = 5;      // <- attribute x
        int y = 7;      // <- attribute y

        public static void main(String[] args) {
            class_name obj_name = new class_name(); // creating an object
            System.out.println(obj_name.x); // Outputs the value of x
            System.out.println(obj_name.y); // Outputs the value of y
        }
    }

    // Calling a method on an object (making an object carry out a method)
    public class class_name {
        public void method_name() {
            System.out.println("Hello World");
        }

        public static void main(String[] args) {
            class_name obj_name = new class_name();
            obj_name.method_name();
        }
    }

    // Constructors - a special method that is used to assignt an object a value
    public class MyClass { // Create a class
        int x;  // Create a class attribute x

        // Create a class constructor for the MyClass class
        public MyClass() {
            x = 5;  // Set the initial value for the class attribute x to 5
        }

        public static void main(String[] args) {
            MyClass myObj = new MyClass();
            // Print the value of x
            System.out.println(myObj.x);
        }
    }

    // To make it so a class's features are not inheritted by other classes we use final like so:
    final class class_name

    // To make a class inherit attributes and methods from another we use extend like so:
    class class_name_to_get_data extends class_name_where_data_resides

    // Getting an input
    // In order to get an input in java we must import the scanner class by doing the following:
    import java.util.Scanner;

    // Now we do the following
    public class class_name{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        }
    }
*/

package com.company;

// Example - Getting inputs
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Getting a string
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String string_name = input.nextLine();
        System.out.println(string_name);

        // Getting an integer
        System.out.println("What is your age?");
        Scanner num = new Scanner(System.in);
        int num_val = num.nextInt();
        System.out.println(num_val);

    }
}
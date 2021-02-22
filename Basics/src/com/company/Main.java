package com.company;

public class Main {
// When declaring a method we can choose between 3 options of accesibility:
// • public - can be accessed anywhere
// • private - can be accessed only within the same class
// • protected - can be accessed both inside its own class and elsewhere as a subclass

// Additionally we have 2 delcarations:
// • static - this is typically used for methods. NEEDS TO BE WRITTEN
// • nonstatic - this is typically used for object which lie inside a of method. NOT WRITTEN, IT IS SET AS THE DEFAULT

// In java, we call functions methods
// There is something like an int main, it is called public static void main (){...
// This language is of course similar to javascript, however, it is more compatible with any computer system
// Lets take a look at some beginner basics shall we?

    // ----------------------------------------------------------------------------------------------------------------------------------------
// **************** DIFFERENT KINDS OF DATA TYPES ****************
    public static void dataTypes(){ // Declaring the function/method dataTypes
        int number = 2134356; // Used for storing a number
        float numbers_and_letters = 4.35f; // Used for storing a large array (unlimited size)
        char single_letter = 'A'; // Used for storing a single letter
        boolean bool = true; // Used for storing a true or false value (yes it is lowecase)
        String text = "Hello World"; // Used for storing a text
        double big_num = 9.72; // Used for storing a decimal number

        // To change a data type from one to the other we do the following:
        double double_variable_name = 23.2435;
        int now_int = (int) double_variable_name;

        // **************** ARRAYS ****************
        String[] array_name = {"item1", "item2", "item3", "item4"};

        // Outputing a specific value from the array
        System.out.println(array_name[1]); // Outputs item2

        // Replacing values in the array
        array_name[0] = "new item name";

        // Getting the array size
        int array_size = array_name.length;

        // 2D array
        int [][] array2D_int = {{0,2,4,6} , {1,3,5,7}};
        String [][] array2D_String = {{"Hello"}, {"world"}};
        // etc etc ...
    }

    // **************** ALL COMMON/BASIC MATH FORMS ****************
    public static void math(){ // Declaring the function/method math
        int y = 20;
        int z = 30;

        // Adding
        System.out.println("Addition");
        System.out.println(z + y);

        // Subtracting
        System.out.println("Subtraction");
        System.out.println(z - y);

        // Multiplication
        System.out.println("Multiplicatoin");
        System.out.println(z * y);

        // Division
        System.out.println("Division");
        System.out.println(z / y);

        // **** INCREMENTING A VALUE ****
        int x = 0;
        x++; // <- this one increases after a process
        // OR
        ++x; // <- this one increases first then carries out the next process

        // We also have
        x += 23; // Which will increment the variable by 23

        // Finding the max value between 2 values
        Math.max(y, z);

        // Square root
        Math.sqrt(x);

        // Radnom number generator from 0 to 1
        Math.random();
    }

    // **************** CHECKS AND SWITCHES ****************
    public static void checks(){ // Decalting the function/method checks
        boolean condition = true;

        // Standard if check procedure
        if (condition == true){
            System.out.println("Carry out action");
        } else if (condition == false){
            System.out.println("Carry out other action");
        } else {
            System.out.println("Carry out standard action");
        }

        // Shortened if and else check
        int x = 50;
        int y = 50;
        // Variable to store result = condition is true? yes, carry out action : no, carry out second action
        String result = (x == y)? "first check works" : "this is else";
        System.out.println(result);

        // Switch statement
        int z = 2;
        switch (z){
            case 1:
                System.out.println("z == 1");
                break;
            case 2:
                System.out.println("z == 2");
                break;
            default:
                System.out.println("Default");
        }
    }

    // **************** WHILE AND FOR LOOPS ****************
    public static void while_for(){ // Declaring the function/method while_for
        // Standard while loop
        boolean condition = true;
        while (condition == true){ // While condition is true
            condition = false; // Carry out action
        }

        // Alternative while loop (not very useful personally)
        int i = 0;
        do {
            System.out.println("hello");
            i++;
        } while (i < 10);

        // For loop
        for (int j = 0; j < 10; j++){
            System.out.println(j);
        }

        // Reading a string using a for loop
        String[] array_name = {"name1", "name2", "name3"};
        for (String string_name : array_name){
            System.out.println(string_name); // Prints out each item within the array
        }

        // If we wish to stop in the middle of a for or while loop, we add a condition that if met, break takes place, like so
        for (int j = 0; j < 10; j++){
            if (j == 5){
                break;
            }
            System.out.println(j);
        }

        // If we wish to skip to the step after in a loop we do the following
        for (int j = 0; j < 10; j++){
            if (j == 5){ // This will skip 5, so the result should be: 0, 1, 2, 3, 4, 6, 7, 8, 9
                continue;
            }
            System.out.println(j);
        }
    }

    // **************** CARRYING A VALUE INTO A METHOD ****************
    public static String example(int x, String value){ // Decalting the function/method example
        return (value + x);
    }

    // **************** EXCEPTIONS ****************
    public static void exceptions(){ // Decalting the function/method exceptions
        // This kinda corelates with checks and switches

        // Want to catch an error? do the following
        try { // Do this
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) { // If error happens
            System.out.println("Something went wrong."); // Display error message
        }

        // Want something to always happen? carry out the following
        try { // Do this
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) { // If error happens
            System.out.println("Something went wrong."); // Display error message
        } finally { // Display this regardless of what happened before
            System.out.println("This will always take place, error or not"); // (Could be used to display a good bye message)
        }
    }

    // **************** DIFFIRENT WAYS TO OUTPUT A VALUE ****************
    public static void output(){ // Decalting the function/method input_output
        // DIFFERENT TYPES OF OUTPUT
        String sentence = "Hello World"; // Saves the string
        System.out.println(sentence); // Outputs the string normaly

        // Misc stuff
        System.out.println(sentence + " is " + sentence.length() + " characters long"); // Outputs the string length starting from 1
        System.out.println(sentence.toUpperCase() + " is " + sentence + " but upper case"); // Outputs the string all in upper case
        System.out.println(sentence.toLowerCase() + " is " + sentence + " but lower case"); // Outputs the string all in lower case

        // A variation of +
        String sentence2 = ", I am alive";
        System.out.println(sentence.concat(sentence2));

        // Finding the position of a specific character starting from position 0
        System.out.println(sentence2.indexOf("e"));
    }


    public static void main(String[] args) { // main class
        // Calling a function/method
        dataTypes(); // Shows you all datatypes and how to write them
        math(); // Shows all basic math actions and their uses
        checks(); // Shows all checks and switches and their uses
        while_for(); // Shows all loops and uses
        exceptions(); // Shows a way to detect error messages
        output(); // Shows all forms of input and output

        // Carrying values into a fuction
        int x = 0;
        String value = "The value of x is: ";
        System.out.println(example(x, value));
    }
}
package com.company;

/*
The reason why java is a higher level language is that you can create entire applications with it alone.
It is popular because it creates a source code (.java) that is written through a JDK*. It then goes through
a bytecode (.class), which can be exported and translated to be used in any operating system (Windows, Mac, or Linux)
through the use of a JRE*.

As a result it can be widely used and understood.

* Java Development Kit (JDK) - allows us to write java code (.java) which gets translated into bytecode
* Java Running Environment (JRE) - allows us to run the application in any operating system

Uses:
• Easy to read/translate
• Can be used to develop applications that can be run in any computer system
• Can translate to JS and HTML to create a UI

Structure:
1) There is a class, which contains all executable code
2) Inside a class there are methods
3) Inside a method there are statements

Download:
Go to https://www.java.com/en/download/manual.jsp and select your opperating system
Download the JDK through https://www.oracle.com/java/technologies/javase-downloads.html

Lets begin!
*/

//  this is a class, a type of data structure where we get to manipulate data and create objects and methods

public class Main {
    // this is a method, a group of statements to carry out an operation
    public static void main(String[] args) { // main is an identifier
        System.out.println("Hello World"); // this is a statement
    }
}
package com.holamundocourse.classes;

public class User {
    // The following are the attributes of the User class
    static String tableName = "Users"; // static means that the variable is shared by all instances of the class. It must be accessed with the class name, not with the instance name.
    private double id = Math.random();
    private String name;
    private int age;
    
    // Constructor WITHOUT "this." - this will cause issues!
    // Commented out to show the problem
    /*
    public User(String name, int age) {
        name = name;  // This doesn't work as expected!
        age = age;    // This assigns the parameter to itself, not the instance variable
    }
    */
    
    // Constructor WITH "this." - this works correctly!
    public User(String name, int age) {
        this.name = name;  // "this.name" refers to the instance variable
        this.age = age;    // "this.age" refers to the instance variable
        System.out.println("User created with this. constructor");
    }
    
    // Default constructor
    public User() {
        System.out.println("Default user created");
    }
    
    // Method where "this." is OPTIONAL (no naming conflict)
    public void sayHello() {
        // Both of these work the same way:
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        // System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
    
    // Method where "this." is REQUIRED (naming conflict with parameters)
    public void updateInfo(String name, int age) {
        // Without "this.", you're just assigning parameters to themselves
        // name = name;  // This does nothing useful!
        // age = age;    // This does nothing useful!
        
        // With "this.", you're assigning to the instance variables
        this.name = name;  // REQUIRED: this.name (instance) = name (parameter)
        this.age = age;    // REQUIRED: this.age (instance) = age (parameter)
    }
    
    // Method demonstrating when "this." is optional but good for clarity
    public void displayInfo() {
        // Without "this." - works fine, no naming conflicts
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // With "this." - also works, more explicit about using instance variables
        // System.out.println("ID: " + this.id);
        // System.out.println("Name: " + this.name);
        // System.out.println("Age: " + this.age);
    }
    
    // Method chaining example - "this." is used to return the current object
    public User setName(String name) {
        this.name = name;
        return this;  // Returns the current object for method chaining
    }
    
    public User setAge(int age) {
        this.age = age;
        return this;  // Returns the current object for method chaining
    }
    
    // Getters - "this." is optional here but sometimes used for clarity
    public String getName() {
        return name;        // or return this.name;
    }
    
    public int getAge() {
        return age;         // or return this.age;
    }
    
    public double getId() {
        return id;          // or return this.id;
    }
}
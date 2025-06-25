package com.holamundocourse.classes;

public class MainUser {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating 'this.' vs no 'this.' ===\n");
        
        // 1. Using default constructor (no parameters, so no naming conflict)
        System.out.println("1. Default constructor:");
        User user1 = new User();
        user1.setName("John").setAge(25);  // Method chaining using 'this'

        user1.sayHello();
        user1.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // 2. Using parameterized constructor (requires 'this.' due to naming conflicts)
        System.out.println("2. Parameterized constructor (requires 'this.'):");
        User user2 = new User("Jane", 30); // Initial values for name and age
        user2.sayHello();
        user2.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // 3. Demonstrating updateInfo method (requires 'this.' due to parameter naming)
        System.out.println("3. updateInfo method (requires 'this.'):");
        User user3 = new User();
        System.out.println("Before update:");
        user3.displayInfo();
        
        user3.updateInfo("Alice", 28);  // This method MUST use 'this.' internally
        System.out.println("\nAfter update:");
        user3.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // 4. Method chaining demonstration
        System.out.println("4. Method chaining (uses 'return this'):");
        User user4 = new User()
            .setName("Bob")      // Returns 'this' for chaining
            .setAge(35);         // Returns 'this' for chaining
        user4.sayHello();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // 5. Demonstrating getter methods (where 'this.' is optional)
        System.out.println("5. Using getters (where 'this.' is optional):");
        User user5 = new User("Charlie", 40);
        System.out.println("Name: " + user5.getName());
        System.out.println("Age: " + user5.getAge());
        System.out.println("ID: " + user5.getId());
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("KEY TAKEAWAYS:");
        System.out.println("✓ 'this.' is REQUIRED when parameter names match instance variable names");
        System.out.println("✓ 'this.' is OPTIONAL when there are no naming conflicts");
        System.out.println("✓ 'this.' is used in method chaining to return the current object");
        System.out.println("✓ 'this.' can improve code readability by being explicit");
        System.out.println("=".repeat(70));
    }
}

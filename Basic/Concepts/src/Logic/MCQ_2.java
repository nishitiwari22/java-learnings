// public class GuessOutput {

// public class MCQ_1 {

// public void sum(int a, int b) {
// System.out.print(a+b);

// }
// public static void main(String[] args){
// sum(0, 0);
// sum(-1, -1);

// }

// Compile time error. Non-static methods cannot be called by static methods. 

// ###

public class MCQ_2 {

    // public static int (int a, int b) {
    // return a+b;

    // }
public static void main(String[] args){
System.out.println(sum(sum(1,2),3);

}

    // Sum methods called 2 times, first outer then inner.

}

// ####

public class MCQ_3 {

    public static int(
    int a,
    int b)
    {
        System.out.print(a + "" + b);
        return a + b;

    }

public static void main(String[] args){
System.out.println(sum(sum(1,2),3);

}

    // Output: 12336 ChatGPT explanation:
}

// ###

public class MCQ_4 {

    public static void main(String[] args) {
        String input = null;
        System.out.println("-" + input.trim() + "-");

    }

    // Output: java.lang.NullPointerException (Explanation: Null can't be trim)
}

// ####

public class MCQ_5 {

public static int a(){
return 65;

    public static int b() {
        return b;
    }

    public static void main(String[] args) {
        System.out.println("" + b());

    }

    // Output: 65 (b methods calls a method at the time of returning

}

// ####

public class MCQ_6 {

    public static void main(String... HELLO_gg) {
        System.out.println(2 > 4 ? "Hi" : "Hello");

    }

    // Output: Hello (2 isn't greater than 4 hence it prints Hello

}

// ####

public class MCQ_7 {

public static void main

    function (temp){
temp*=2;

}

    public static void main(String[] args) {
        int a = 10;
        function(a);
        System.out.print(a);

    }

    // Output: 10 (Nothing change in orginal value of a variable)

}}

// // In Java, **non-static methods cannot be directly called by static
// methods** because **static methods belong to the class itself**, whereas
// **non-static methods belong to an instance (object) of the class**. Let's
// break it down:

// ### 1. **Static Methods Belong to the Class**
// - A `static` method is shared among all instances of a class.
// - It can be called **without** creating an object of the class.
// - It does not have access to instance variables or methods directly.

// ### 2. **Non-Static Methods Belong to an Object**
// - A non-static method is associated with an **instance** of the class.
// - It requires an object to be invoked because it can access instance
// variables and methods.

// ### 3. **Why Can't Static Methods Call Non-Static Methods?**
// - Since **static methods do not belong to any specific object**, they **do
// not have access** to instance variables or non-static methods.
// - A **non-static method requires an object** to operate, but a static method
// doesn’t have an implicit reference (`this`) to an instance.

// ### 4. **Example Code:**
// ```java
// class Example {
// int num = 10; // Instance variable

// void nonStaticMethod() { // Non-static method
// System.out.println("Non-static method called!");
// }

// static void staticMethod() {
// // nonStaticMethod(); // ❌ Error: Cannot make a static reference to a
// non-static method
// System.out.println("Static method called!");
// }

// public static void main(String[] args) {
// staticMethod(); // ✅ Can be called directly

// // Calling non-static method requires an object
// Example obj = new Example();
// obj.nonStaticMethod(); // ✅ Correct way to call a non-static method
// }
// }
// ```
// ### 5. **How to Access Non-Static Methods from Static Methods?**
// - Create an instance of the class and then call the non-static method:
// ```java
// Example obj = new Example();
// obj.nonStaticMethod(); // ✅ Now it works
// ```

// ### 6. **Key Takeaways**
// - **Static methods** do not have access to `this` (because they are not tied
// to an instance).
// - **Non-static methods** need an object to be called.
// - To call a non-static method from a static one, **you must create an
// object**.

// Would you like an example where this rule is applied in a real-world
// scenario? 😊
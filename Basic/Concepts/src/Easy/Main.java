


public class pract {

// i. Write a Java class to swap two numbers without using third variable.

 
import java.util.Scanner;
class tomorrow{
public static void main(String[] args) {

    int a,b;
    System.out.println("Enter any two numbers");
    Scanner ref=new Scanner(System.in);
    a=ref.nextInt(); // a = 100
    b=ref.nextInt(); //b = 200
    System.out.println("Before Swapping "+a+" "+b); // 100 200
    a=a+b; // a=100+200=300
    b=a-b; // b=300+200=100
    a=a-b; // a=300+100=200
    System.out.println("After swapping "+a+" "+b);
}
}



//i. Write a Java program to determine the number of vowels in a String


/*
import java.util.Scanner;
public class practical{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter a string");
// reads a line of text from the console, converts it to lowercase characters, and stores it in the String variable str.
String str = input.nextLine().toLowerCase();
input.close();
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch ==  'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The number of vowels in a string are " + count);
    }
}



// iv. Write a Java Program to determine whether the number is Armstrong or not.


/*
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();

    int originalNumber = number;
    int result = 0;
    int n = String.valueOf(number).length();

    while(number != 0)
    {
        int remainder = number % 10;
        result += Math.pow(remainder, n);
        number /= 10;
    }

   if(result == originalNumber){
System.out.println(originalNumber + " is an armstrong number");
   } else {
    System.out.println(originalNumber + " is not an armstrong number");
   }
}
}
 */



// v. Write a Java Program to determine whether the number is prime or not.


/* 
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();

boolean isPrime = true;
    for(int i = 2; i<=Math.sqrt(number); i++){
        if(number % i == 0){
            isPrime = false;
            break;
        }
    }

 
   if(isPrime){
System.out.println(number + " is a Prime number");
   } else {
    System.out.println(number  + " is not a Prime number");
   }
}
}
*/
// **********


// i. Write a Java program for the following scenario: Run a loop  from 1 to 100, while looping when the number is even print its
// square and when the number is odd print its cube.


/* 
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // System.out.println("Enter a number: ");
    int number = input.nextInt();
for(int i = 1; i<=100; i++)
{
    if(i % 2 == 0){
    int square = i * i;
    System.out.println(i + " is even so its square is " + square);
    }
    else{
        int cube = i * i* i;
        System.out.println(i + " is odd so its cube is " +  cube);
    }
}
}
}
*/

// ii. Write a Java program to print the following Floyd Triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1

// import java.util.Scanner;

// import javax.sound.midi.Soundbank;

/* 
public class practical{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int rows = 4;
        int number = 1;
    for(int i = 1; i<=rows; i++){
    for(int j = 1; j<=i; j++){
System.out.println(number % 2 + " ");
number++;
    }
    System.out.println();
        }
    
    }
}
*/

// iii. Write a Java Program to print following
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1


/*
public class practical{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    }
}
 */

//************

// i. Write a Java class Employee with variables name, age, gender write setter and getter methods for it.

// It's giving some erros during output. lol ghatcgt sucks!

/* 
public class practical{
    // public static void main(String[] args) {
        private String name;
        private int age;
        private char gender;

        // Constructor
    public practical(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

        //Getter methods
        public String getName(){
        return name;
        }
        public int getAge(){
        return age;
            }
        public char getGender(){
            return gender;
                }

        //Setter methods
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setGender(char gender){
            this.gender = gender;
        }

        practical john = new practical("John Smith", 35, 'M');

        // System.out.println(john.getName()); // Output: "John Smith"
        // System.out.println(john.getAge()); // Output: 35
        // System.out.println(john.getGender()); // Output: 'M'
        
        
        //john.setAge(36);
        
        // System.out.println(john.getAge()); // Output: 36
        
    }
*/

// }


// ii. Write a class mobile with methods call() and sms(). Write a class Demo and access it.

//change practical to mobile


/* 
public class practical{
    public void call(String number){
        System.out.println("Calling " + number + number + "..." );

    }
    public void sms(String number, String message){
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}

//change practical to demo
public class practical{
    public static void main(String[] args) {
        //here change practical to mobile
        practical practical = new practical();
        practical.call("555-1234");
        mobile.sms("555-5678", "Hello, World!")
    }
}
*/


// Write a Java Program to convert the “59” to Primitive float (without using Constructor of Float).

// public class FloatConversionExample {
//     public static void main(String[] args) {
//         String numStr = "59"; // the string we want to convert to float
//         float numFloat = Float.parseFloat(numStr); // convert the string to float
//         System.out.println("Converted float: " + numFloat);
//     }
// }



// ii. Write a Java Program to find the minimum value in Vector [8,9,1,3,4].


/* 
import java.util.Vector;

public class practical{
    public static void main(String[] args) {
    
    Vector<Integer>  vector= new Vector<Integer>();
    vector.add(8);
    vector.add(9);
    vector.add(1);
    vector.add(3);
    vector.add(4);

    int min = vector.get(0);
for(int i = 1; i < vector.size(); i++){
    if(vector.get(i) < min){
        min = vector.get(i);
    }
}
System.out.println("Minimum value in the vector is: " + min);
    }
    }
    */


// iii. Write a Java Program to find the number of String starting
// with „S‟ from following TreeSet [ Smith, Alex , Tom, Steve, Mark, Sammy]



/* 
import java.util.TreeSet;

public class practical{
    public static void main(String[] args) {
    
    TreeSet<String> set  = new TreeSet<String>();
    set.add("Smith");
    set.add("Alex");
    set.add("Tom");
    set.add("Steve");
    set.add("Mark");
    set.add("Sammy");


    int count = 0;
for(String s : set){
    if(s.startsWith("S")){
       count++;
    }
}
System.out.println("Number of strings starting with 'S' is: " + count);
    }
    }
*/

// Sort the given list of objects in order of their email Contact: id, name, email, phone

// import java.util.Comparator;
// import java.util.List;
// import java.util.stream.Collectors;

// class Contact {
//     private int id;
//     private String name;
//     private String email;
//     private String phone;

//     // Constructor and getters/setters omitted for brevity

//     @Override
//     public String toString() {
//         return "Contact{" +
//                 "id=" + id +
//                 ", name='" + name + '\'' +
//                 ", email='" + email + '\'' +
//                 ", phone='" + phone + '\'' +
//                 '}';
//     }
// }

// public class SortContactsByEmail {
//     public static void main(String[] args) {
//         // Sample list of contacts
//         List<Contact> contacts = List.of(
//                 new Contact(1, "John Doe", "johndoe@gmail.com", "123-456-7890"),
//                 new Contact(2, "Jane Smith", "janesmith@hotmail.com", "555-555-5555"),
//                 new Contact(3, "Bob Johnson", "bobjohnson@yahoo.com", "555-123-4567")
//         );

//         // Sort the list by email using a Comparator
//         List<Contact> sortedContacts = contacts.stream()
//                 .sorted(Comparator.comparing(Contact::getEmail))
//                 .collect(Collectors.toList());

//         // Print out the sorted list
//         System.out.println(sortedContacts);
//     }
// }








// -----------------------------














// import javax.xml.crypto.KeySelector.Purpose;

// public class practical {
// i. Write a Java class to swap two numbers without using third variable.

/* 
import java.util.Scanner;
class practical{
public static void main(String[] args) {

    int a,b;
    System.out.println("Enter any two numbers");
    Scanner ref=new Scanner(System.in);
    a=ref.nextInt(); // a = 100
    b=ref.nextInt(); //b = 200
    System.out.println("Before Swapping "+a+" "+b); // 100 200
    a=a+b; // a=100+200=300
    b=a-b; // b=300+200=100
    a=a-b; // a=300+100=200
    System.out.println("After swapping "+a+" "+b);
}
}
*/


// ii. Write a Java Program to determine reverse the number (Again try to understand dry run)


/* 
import java.util.Scanner;
class practical{
public static void main(String[] args) {

    int n,r;
    System.out.println("Enter any number");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt(); // 

    while(n>0)
    {
        r = n%10;
        System.out.println("Reverse order "+r);
        n=n/10;
    }
}
}
*/


// iii. Write a Java class to print the Fibonacci sequence till 100

/*
import java.util.Scanner;
class practical{
public static void main(String[] args) {

    int n1 = 0, n2 = 1 , n3 = 0;
    System.out.println(n1 +" "+ n2);// print the first two numbers
 
    // loop through the sequence and print each number
    while(n3<100)
    {
        n3 = n1+n2; // calculate the next number
        if(n3<100){
        System.out.println(" "+n3); // print the number
        Scanner ref=new Scanner(System.in);
        n3=ref.nextInt();
    }

    n1 = n2;
    n2 = n3;
}
}
}
 */

// iv. Write a Java Program to determine whether the number is Armstrong or not.


/*
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();

    int originalNumber = number;
    int result = 0;
    int n = String.valueOf(number).length();

    while(number != 0)
    {
        int remainder = number % 10;
        result += Math.pow(remainder, n);
        number /= 10;
    }

   if(result == originalNumber){
System.out.println(originalNumber + " is an armstrong number");
   } else {
    System.out.println(originalNumber + " is not an armstrong number");
   }
}
}
 */



// v. Write a Java Program to determine whether the number is prime or not.


/* 
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();

boolean isPrime = true;
    for(int i = 2; i<=Math.sqrt(number); i++){
        if(number % i == 0){
            isPrime = false;
            break;
        }
    }

 
   if(isPrime){
System.out.println(number + " is a Prime number");
   } else {
    System.out.println(number  + " is not a Prime number");
   }
}
}
*/
// **********


// i. Write a Java program for the following scenario: Run a loop  from 1 to 100, while looping when the number is even print its
// square and when the number is odd print its cube.


/* 
import java.util.Scanner;
public class practical{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // System.out.println("Enter a number: ");
    int number = input.nextInt();
for(int i = 1; i<=100; i++)
{
    if(i % 2 == 0){
    int square = i * i;
    System.out.println(i + " is even so its square is " + square);
    }
    else{
        int cube = i * i* i;
        System.out.println(i + " is odd so its cube is " +  cube);
    }
}
}
}
*/

// ii. Write a Java program to print the following Floyd Triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1

// import java.util.Scanner;

// import javax.sound.midi.Soundbank;

/* 
public class practical{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int rows = 4;
        int number = 1;
    for(int i = 1; i<=rows; i++){
    for(int j = 1; j<=i; j++){
System.out.println(number % 2 + " ");
number++;
    }
    System.out.println();
        }
    
    }
}
*/

// iii. Write a Java Program to print following
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1


/*
public class practical{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    }
}
 */

//************

// i. Write a Java class Employee with variables name, age, gender write setter and getter methods for it.

// It's giving some erros during output. lol ghatcgt sucks!

/* 
public class practical{
    // public static void main(String[] args) {
        private String name;
        private int age;
        private char gender;

        // Constructor
    public practical(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

        //Getter methods
        public String getName(){
        return name;
        }
        public int getAge(){
        return age;
            }
        public char getGender(){
            return gender;
                }

        //Setter methods
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setGender(char gender){
            this.gender = gender;
        }

        practical john = new practical("John Smith", 35, 'M');

        // System.out.println(john.getName()); // Output: "John Smith"
        // System.out.println(john.getAge()); // Output: 35
        // System.out.println(john.getGender()); // Output: 'M'
        
        
        //john.setAge(36);
        
        // System.out.println(john.getAge()); // Output: 36
        
    }
*/

// }


// ii. Write a class mobile with methods call() and sms(). Write a class Demo and access it.

//change practical to mobile


/* 
public class practical{
    public void call(String number){
        System.out.println("Calling " + number + number + "..." );

    }
    public void sms(String number, String message){
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}

//change practical to demo
public class practical{
    public static void main(String[] args) {
        //here change practical to mobile
        practical practical = new practical();
        practical.call("555-1234");
        mobile.sms("555-5678", "Hello, World!")
    }
}
*/


// iii. Write a class MathDemo with methods square() with one parameter
// and add() with two parameters. Call these methods to get the output.

/* *
public class practical{
    public static int square(int num) {
        return num * num;
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int xSquared = square(x);
        int sum = add(x,y);

        System.out.println("The sqaure of " + x + " is " +  xSquared);
    
        System.out.println("The sum of " + y + " is " +  sum);

}
}
 */

//************

// Write a Java class for following methods
// display() -- Display number from 1 to 100 using while loop in Java
// fibonacci() -- Prints Fibonacci series till 100

//************
// Write a class Automobile with default constructor, write a class Plane
//which extends Automobile and has a default as well as parameterized
// constructor, write a class Airbus with a default
// constructor which extends Plane.

//************

// i. Write a Java Program to convert “25” to Primitive as well as Wrapper.
// ii. Write a Java program to convert 110011 to decimal value.


//************

// Write a Java Program to convert the “59” to Primitive float (without using Constructor of Float)


//************

// Write a class User with abstract methods pay() and receive(), later make
// two concrete class GoldUser and SilverUser, override the abstract
// method.


//************

// Write a Java program to write the following, class A with method m1( )
// and m2( ) and write a class B with methods m3( ) and m4( ),
// Override the methods of A in class B.

//************

//  Write an abstract class Car with methods start() and stop(). Write a
//class Santro and Audi and override the methods.

//  Write two interfaces SportsCar and CommercialCar and
// implement the appropriate interface on the appropriate class made in
// example 1.

//************

//  Make an Interface CE which have methods call(), sms (), Make
// another interface ISO which have methods radiation() and sound().

// Make two classes IPhone and Galaxy and make them implement both the interfaces.

//  Write a Java program to make a package com.shapes, make classes
// Circle and Square in the same package.

//************

// i. Write a Java Program to make an Exception AgeException. When
// user passes some age and if age is less than 18 throw this Exception.

import java.util.Scanner;

class AgeException extends Exception{

    //empty constructor
    public AgeException(){}

    public AgeException(String Message){
        super(message);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");

        try{
            int age = input.nextInt();
            if(age < 18){
                throw new AgeException("You must be atleast 18 years old");
            }
            System.out.println("Your age is: " + age);
        }catch (AgeException e){
            System.out.println("Exception caught" + e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid input please enter a valid age");
        }
    }

}

// ii. Create an Exception StringNotPalindromeException. Write a class
// with method which throws this Exception when String passed is not palindrome.

//************

//i. Write a Java program to determine the number of vowels in a String


/*
import java.util.Scanner;
public class practical{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter a string");
// reads a line of text from the console, converts it to lowercase characters, and stores it in the String variable str.
String str = input.nextLine().toLowerCase();
input.close();
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch ==  'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The number of vowels in a string are " + count);
    }
}
 */



// ii. Write a Java program for separate hours, minutes and seconds from
// following string 01:23:45 PM.


// We create a Java program that separates hours, minutes, and seconds from the string "01:23:45 PM".
// We use the split() method to split the string into its component parts.
// We convert the hours, minutes, and seconds parts from String to int using Integer.parseInt().
// We check the AM/PM indicator and adjust the hours accordingly.
// We print out the hours, minutes, and seconds to the console.



public class practical{
    public static void main(String[] args) {
        String timeString = "01:23:45 PM";

        //Split the string into hours, minutes, seconds and AM/PM

        String[] parts = timeString.split(":");

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            String[] secondsParts = parts[2].split(" ");
            int seconds = Integer.parseInt(secondsParts[0]);
            String ampm = secondsParts[1];

            //Adjust hours if necessary for PM
        if(ampm.equalsIgnoreCase("PM")){
            hours+=12;

        }
                
    //Print the results
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + seconds);

    }
}


//************
// i. Write a Java Program to store the following data, in the collection you feel will suite best.
// Name- Tom
// Email- tom@gmail.com Phone:9988776655


//Learn how will I fetch it?


/* 
import java.util.HashMap;

public class practical{
    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<String, String>();
        user.put("Name", "Tom");
        user.put("Email", "tom@gmail.com");
        user.put("Phone", "9988776655");


    }
}
*/


// ii. Write a Java Program to find the minimum value in Vector [8,9,1,3,4].


/* 
import java.util.Vector;

public class practical{
    public static void main(String[] args) {
    
    Vector<Integer>  vector= new Vector<Integer>();
    vector.add(8);
    vector.add(9);
    vector.add(1);
    vector.add(3);
    vector.add(4);

    int min = vector.get(0);
for(int i = 1; i < vector.size(); i++){
    if(vector.get(i) < min){
        min = vector.get(i);
    }
}
System.out.println("Minimum value in the vector is: " + min);
    }
    }
    */


// iii. Write a Java Program to find the number of String starting
// with „S‟ from following TreeSet [ Smith, Alex , Tom, Steve, Mark, Sammy]



/* 
import java.util.TreeSet;

public class practical{
    public static void main(String[] args) {
        
    TreeSet<String> set  = new TreeSet<String>();
    set.add("Smith");
    set.add("Alex");
    set.add("Tom");
    set.add("Steve");
    set.add("Mark");
    set.add("Sammy");


    int count = 0;
for(String s : set){
    if(s.startsWith("S")){
       count++;
    }
}
System.out.println("Number of strings starting with 'S' is: " + count);
    }
    }
*/

//************

// Sort the given list of objects in order of their email Contact: id, name, email, phone






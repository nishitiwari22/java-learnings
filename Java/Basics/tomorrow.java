


// public class practical {
// i. Write a Java class to swap two numbers without using third variable.

/* 
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
*/


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












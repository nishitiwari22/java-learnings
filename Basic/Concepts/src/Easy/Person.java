
// Change Value
// import java.util.Arrays;

// public class ChangeValue {
//     public static void main(String[] args) {
//         //create an array
//         int[] arr = {1,3,2, 45, 6};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
  
//     static void change(int[] nums)
//     {
//         nums[2]=99; //If you make a change to the object via this ref variable, same object will be changed
//     }

// }


// public class Greeting{
// public static void main(String[] args){
//     greeting();
// }
// static void greeting(){
//     System.out.println("Hello World!");
// }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         //Q: Take input of 2 numbers and print the sum
//         Scanner in = new Scanner(System.in);
//         int num1, num2, sum;
        
//         System.out.println("Enter number 1:");
//         num1 = in.nextInt();
//         System.out.println("Enter number 2:");
//         num2 = in.nextInt();
//         sum = num1 + num2;
//         System.out.println("The sum = " + sum);
     
//     }
    
// }

// public class Main{
//     public static void main(String[] args){
//         // fun(67);
//         // fun("Nishi Tiwari");
//         int ans= sum(3,4,78);
//         System.out.println(ans);
//     }
//     static int sum(int a, int b){
//         return a+b;
//     }
//     static int sum(int a, int b, int c){
//         return a+b+c;
// }
// static void fun(int a){
//     System.out.println("First one");
//     System.out.println(a);
// }
// static void fum(String name){
//     System.out.println("Second one");
//     System.out.println(name);
    
// }
// }

// public class PassingExample{
//     public static void main(String[] args){
//         String chacha = "Iron man";
//         greet(chacha);
//     }
    
//     static void greet(String naam){
//             System.out.println(naam);
//     }
// }
    
// }






// public class Shadowing {
//     static int x = 90; // this will be shadowed at line 8
//     public static void main(String[] args) {
//         System.out.println(x); // 90
//         int x; // the class variable at line 4 is shadowed by this
// //        System.out.println(x); // scope will begin when value is initialised
//         x = 40;
//         System.out.println(x); // 40
//         fun();
//     }

//     static void fun() {
//         System.out.println(x);
//     }
// }




// public class Scope {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         String name = "Kunal";
//         {
// //                int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
//                 a = 100; // reassign the origin ref variable to some other value
//             System.out.println(a);
//                 int c = 99;
//                 name = "Rahul";
//             System.out.println(name);
//                 // values initialised in this block, will remain in block
//         }
//         int c = 900;
//         System.out.println(a);
//         System.out.println(name);
// //        System.out.println(c); // cannot use outside the block

//         // scoping in for loops
//         for (int i = 0; i < 4; i++) {
// //            System.out.println(i);
//             int num = 90;
//             a = 10000;
//         }
//         System.out.println();
//     }

//     static void random(int marks) {
//         int num = 67;
//         System.out.println(num);
//         System.out.println(marks);
//     }
// }




// import java.util.Scanner;

// public class StringExample {

//     public static void main(String[] args) {
// //        String message = greet();
// //        System.out.println(message);

//         Scanner in  = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String naam = in.next();
//         String personalised = myGreet(naam);
//         System.out.println(personalised);
//     }

//     static String myGreet(String name) {
//         String message = "Hello " + name;
//         return message;
//     }


//     static String greet() {
//         String greeting = "how are you";
//         return greeting;
//     }
// }





// import java.util.Scanner;

// public class StringExample {

//     public static void main(String[] args) {
// //        String message = greet();
// //        System.out.println(message);

//         Scanner in  = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String naam = in.next();
//         String personalised = myGreet(naam);
//         System.out.println(personalised);
//     }

//     static String myGreet(String name) {
//         String message = "Hello " + name;
//         return message;
//     }


//     static String greet() {
//         String greeting = "how are you";
//         return greeting;
//     }
// }





// import java.util.Arrays;

// public class VarArgs {
//     public static void main(String[] args) {
// //        fun();
// //        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
// //        demo();
//     }

//     static void demo(int ...v) {
//         System.out.println(Arrays.toString(v));
//     }

//     static void demo(String ...v) {
//         System.out.println(Arrays.toString(v));
//     }

//     static void multiple(int a, int b, String ...v) {

//     }

//     static void fun(int ...v) {
//         System.out.println(Arrays.toString(v));
//     }
// }













// public class Person {

// 	int empID;

// 	Person(int empID) {
// 		this.empID = empID;
// 	}

// 	public int getEmpID(){
// 		return empID;
		
// 	}

// }


// public interface Shape {
// 	public void computeArea();
// }


// public class Rectangle implements Shape {
// 	@Override
// 	public void computeArea() {
// 	System.out.println("Compute Rectangle Area")



	


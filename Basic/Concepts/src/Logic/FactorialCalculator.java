import java.util.Scanner;

// public class FibSeries {

//     public static void main(String args[]) {

//         int num1 = 0, num2 = 1;
//         int next;
//         System.out.print(num1 + "," + num2);

//         for (int i = 1; i < 9; i++) {
//             next = num1 + num2;
//             System.out.print("," + next);
//             num1 = num2;
//             num2 = next;

//         }

//         // A different yet similar variation:
//         // Increasing Loop
//         // int num3 = 3;
//         // int fact = 1;
//         // for (int i = 1; i <= num; i++) {
//         // fact *= i; // fact = fact*i;
//         // }
//         // System.out.println(num3 + "! = " + fact);

//         // Increasing Loop
//         int num4 = 3;
//         int fact1 = 1;
//         for (int i = num; i >= 1; i--) {
//             fact *= i; // fact = fact*i;
//         }
//         System.out.println(num3 + "! = " + fact);

//     }

// Doing the same with giving a method and a user input

public class FactorialCalculator {
    // Method to calculate factorial
    private static void calculateFactorial(int num) {
        int fact = 1; // Initialize factorial result

        for (int i = num; i >= 1; i--) {
            fact *= i; // fact = fact*i;
        }
        System.out.println(num + "! = " + fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner obj for user input

        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Take user input

        // Call the factorial method
        calculateFactorial(num);

        sc.close(); // closing scanner;
    }

}

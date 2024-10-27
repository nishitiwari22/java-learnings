public class loll {    
    // Method to display numbers from 1 to 100 using while loop
    public static void display() {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Add a new line after displaying all the numbers
    }
    
    // Method to print the Fibonacci series till 100
    public static void fibonacci() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        
        while (n3 <= 100) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.println(); // Add a new line after displaying the Fibonacci series
    }
    
    // Main method to test the display() and fibonacci() methods
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100:");
        display();
        
        System.out.println("Fibonacci series till 100:");
        fibonacci();
    }
}

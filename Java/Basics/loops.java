import java.util.Scanner;



public class loops {

    public static void main(String[] args) {
        
/* 
  Syntax of for loops:
  //We use for loop when we know how mnay timeas the looop is going to run
  //Example: Print numbers from 1 to 10
  for(initialisation; condition; increment/decrement)
  //body
 */

 // Q: Print numbers from 1 to 5
//  for(int num = 1; num<=5; num += 2){
//     System.out.println(num);
//  }

 // Q: Print numbers from 1 to n
/* 

 Scanner in = new Scanner(System.in);
 int n = in.nextInt();

 for (int num = 1; num <= n; num++) {
    // System.out.println(num + " ");
    System.out.println(" Hello World! ");

    in.close(); // Resolved resource leak error by clsoing in.close()
 }

 */

 //***While Loops  ****/

/* 
 Syntax:
 while(condition){
    body
 }
 */ 


 /*
 //We use the while loop wen we don't know how many times the loop is going to run.
 // Example: Keep taking input from the suer until the user does not press 'x'   
 int num = 1; // Initilization
    while(num<=5){ // Condition
        System.out.println(num); //body
        num += 1;
    }

    //In do while it will execute atleast once.
    int n = 1;
    do{
        System.out.println("Hello World!");
        // n++;
    }while(n != 1);

    }
}


*/


// ******* Questions ********

// Q1: Largest number

// Scanner in = new Scanner(System.in);
// int a = in.nextInt();
// int b = in.nextInt();
//  int c = in.nextInt();

/* 
int max = a;
if( b > max)
{
    max = b;
}
if( c > max){
    max = c;
    System.out.println(max);
    in.close();
}
*/ 

// int max = Math.max(c, Math.max(a,b));
// System.out.println(max);
// in.close();

// }
// }

// Q2 : Alphabet case check

/* 
Scanner in = new Scanner(System.in);
char ch = in.next().trim().charAt(0);

if(ch >= 'a' && ch <= 'z')
{
    System.out.println("Lowercase");
}
else 
{
    System.out.println("Uppercase");
}
System.out.println(ch);
in.close();

}
}
*/

// Q3 : Fibonacci numbers

/*
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = 0;
int b = 1;
int count = 2;

while(count <= n){
    int temp = b;
    b = b+a;
    a = temp;
    count++;
}
System.out.println(b);
in.close();
    }
}
 */ 


// Q4 : Counting occurrences


/* 
int n = 45536;

int count =0;
while(n>0)
{
    int rem = n % 10;
    if(rem == 5)
    {
    count++;
    }
    n = n / 10;
}
System.out.println(count);
    }
}


*/
// Q5 : Reverse

int num = 245678;

int ans = 0;

while(num > 0)
{
    int rem = num % 10;
    num /= 10;

    ans = ans * 10 + rem;
}
System.out.println(ans);
    }
}

// Calculator program
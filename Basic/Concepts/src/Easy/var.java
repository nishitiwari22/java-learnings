// public class var {
//     static int b = 20; // static (Single copy)
//     int c = 30; //instance
//     public static void main(String[] args) {
//         int a = 10; //local (Multiple copy)
//         // vaariable ref=new vaariable();
//         // System.out.println(a);
//         // System.out.println(vaariable.b);
//         // System.out.println(ref.c);


        
//     }

// } 


//  New program to see static (Single copy) and local (multiple copy)
// public class vaariable {
//     static int b = 20; // static (Single copy)
//     int c = 30; //instance
//     public static void main(String[] args) {
//         int a = 10; //local (Multiple copy)
//         vaariable ref=new vaariable();
//         System.out.println(a);
//         System.out.println(vaariable.b);
//         System.out.println(ref.c);


        
//     }

// } 


// class variabless {
//     static int b = 20; //Static
//     int c = 30; //instance
//     public static void main(String[] args) {
//         int a = 10; //Local
//         variabless ref = new variabless();
//         System.out.println(a); //Directly access
//         System.out.println(variabless.b); // With the help of class
//         System.out.println(ref.c); // With the help of ref obj

//     }
// }


//Comparing local & static

// class Compare
// {
//     static int a = 10;
//     void fun()
//     {
//         int b = 10;
//         System.out.println(a+ " "+ b);
//         ++a; ++b;
//     }
//     public static void main(String[] args)
// {
//     Compare r=new Compare();
//     r.fun();
//     r.fun();
// }    
//     }
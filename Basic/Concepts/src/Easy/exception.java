public class exception {
    // 6 Cases can be formed
// try{
//     statement 1;
//     statement 2;
//     statement 3;
// }
// catch(Exception e){
//     statement 4;
// }
// finally{
//     statement 5;
// }
// statement 6;




// class Handle {
//     public static void main(String[] args) {
        
//         System.out.println("Hello, World!");
//         int a = 10 , b = 0, c;
//         try{
//         c= a/b; //c=10/0
//         System.out.println(c);
//         }
//         catch(Exception s)
//         {
//             System.out.println(e);
//         }
//         System.out.println("main method end");
//     }
// }
}



//Exception can only be in try block and not in catch and finally block. If I have exception in catch & finally I am dumb

// class Handling {
//     public static void main(String[] args) {
//         try{
//             System.out.println("Radhe Krishna");
//             int a = 20, b=2, c;
//             c=a/b;
//             System.out.println(c);
//             System.out.println("Sita Ram");
//         }
//         catch(ArithmeticExcpetion a){
//             System.out.println("can't divide by zero");
            
//         }
//         finally {
//             int m =20, n=0, p;
//             p=m/n;
//             System.out.println(p);
//             System.out.println("Laxmi Narayan");
//         }
//         System.out.println("main method ended");
        
//     }
// }



// class Cricketer {
//     Cricketer(){
//          System.out.println("Object is created");
//     }
//     protected void finalize(){
//         System.out.println("Object is destroyed");
//     }
// }
// class CricketerDemo{
//     public static void main(String[] args)
//     {
//         Cricketer c = new Cricketer();
//         c = null; //1. By assigning a null
        
//         Cricketer c1 = new Cricketer();
//         Cricketer c2 = new Cricketer();
//         c1 = c2; //2.By assigning ref to another
        
//         new Cricketer(); //3. By anonymous object
        
//         System.gc(); //Forces the garbage collector to do garbage collection
//     }
// }
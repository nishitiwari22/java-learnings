public class thhis {
    
    //Dhayan se dekhna samjjhega kya ho raha hai.
    thhis(){
        this(10);
    }
    thhis(int a)
    {
        System.out.print(a);
    }
    
    
    // thhis(){
    //     System.out.println("Learn Coding");
        
    // }
    // thhis(int a){
    //     System.out.print("Learn Coding");
    //     this(); // Calls default constructor of the same class
    //     //Constructor is also a method which requires parentheses
    //     System.out.println(a);
    // }
    
    
    //Let's make same instance and local varaible and resolve it by using this
    // int a;
    // thhis(int a)
    // {
    //   this.a =a; // JVM got confused which is local which is instance and so it ingored the value 100 that we gave and printed the default value of integer that is '0'
    // }
    
    // void show(){
    //     System.out.println(a);
    // }
    
    //Checking if 'this' points to same object as of 'r'
    //void show(){
      //  System.out.println(this); //Written under constructor and not in method
    // }
    public static void main(String[] args) {
        // thhis r = new thhis();
        
        // thhis r = new A(100);
        // r.show();
        
        //thhis r=new A(); //For object initilisation 
       // System.out.println(r);
       // r.show(); // This proves that 'this' is also pointing to the same object which is the current object of class
    }
} 
    
// }

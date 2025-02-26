public final class fin { // Making whole class final so now it can't inherit anything
void mNumber()
{
    System.out.println("9324409695");
}
final void atmPIN()
{
    System.out.println("1234");
}
}  
class Thief extends finnal{
   @Override
   void mNumber()
{
    System.out.println("9324409695");
}
    @Override
final void atmPIN()
{
    System.out.println("1234");
}

}
class Final{
   public static void main(String[] args) {
       Thief t = new Thief();
       t.mNumber(); t.atmPIN();
}
}
//     /*
//     class Finnal {
//     public static void main(String[] args) {
//         final int A = 10 //Whenever we decalre the variable in uppercase it means it is Final
//         System.out.println(A);
//         A=20; // It will give error
//      System.out.println(A);

//     }
// }

// /* finnal {
    
}

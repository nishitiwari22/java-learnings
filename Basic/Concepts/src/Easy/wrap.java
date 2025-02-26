public class wrap {
    public class Demo{
        /**
         * @param args
         */
        public static void main(String[] args) {
            int num = 7;
            Integer num1 = new Integer(num); //boxing (Taking a primitive value and storing into primitive object)
            // int num2 = num1.intValue(); 
            int num2 = num1; //auto-unboxing
            
            System.out.println(num2);
            
            String str = "12" // Taking integer as a string
           // System.out.print.ln(str*2); // This is not possible as we cannot multiply the value.
            
            int num3 = Integer.parseInt(str) //Converting string to integer
            
            System.out.print(num3*2)
            
            System.out.println(num1);
        }
    }
}

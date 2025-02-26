public class typecasting {

    // class implicit {
    // public static void main(String[] args) {
    // int a = 5; // 4 bytes
    // double b = a; // 8 bytes
    // System.out.println(b);
    // }

    // }

    class explicit {
        public static void main(String[] args) {
            double a = 5; // 4 bytes
            int b = (int) a; // 8 bytes
            System.out.println(b);
        }
    }

}

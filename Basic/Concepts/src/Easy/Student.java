public class Student {

    public static int count = 0;

    public Student(){
        count++;
    }

    private String name;
    private int rollNumber;
    private int age;

    // Constructor
    public Student(String name, String rollNumber, String age) {
        this.name = name;
        // this.rollNumber = rollNumber;
        // this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getage() {
        return age;
    }

    // public void setAge(int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    // }

    public static int getCount(){
        return count;
    }

    
}

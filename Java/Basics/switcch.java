import java.util.Scanner;

public class switcch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("King of fruits");
                break;

            case "Orange":
                System.out.println("King of fruits");
                break;

            case "Grapes":
                System.out.println("King of fruits");
                break;
            default:
                System.out.println("Valid fruit daalo");
        }
        


switch(day){
    case 1 -> System.out.println("Monday")
    case 2 -> System.out.println("Tuesday"); 
    case 3 ->  System.out.println("Wednesday");
    case 4 ->  System.out.println("Thursday");
    case 5 ->  System.out.println("Friday");
    case 6 -> System.out.println("Saturday");
    case 7 -> System.out.println("Sunday");
    int day = in.nextInt();
}


switch(day){
    case 1,2,3,4,5 -> System.out.println("Weekday");
    case 6,7 -> System.out.println("Weekend");
}


//Nested Switch Statement

int empID = in.nextInt();
String departmnent = in.next();

switch(empID){
    case 1:
    System.out.println("Nishi Tiwari");
    break;
    case 2:
    System.out.println("Hamster Tiwari");
    break;
    case 3:
    System.out.println("Emp Number 3");
    switch(departmnent){
        case "IT":
        System.out.println("IT Department");
        break;
        case "HR":
        System.out.println("HR Department");
        break;
        case "Management":
        System.out.println("Management Department");
        default:
        System.out.println("Invalid Department");
        break;
    }
    break;
    default:
    System.out.println("Invalid")
}

//Better way to write
case 1 -> System.out.println("Nishi Tiwari");
case 1 -> System.out.println("Hamster Tiwari");
case 3 -> System.out.println("Emp Number 3");
switch(departmnent){
    case "IT":
    System.out.println("IT Department");
    break;
    case "HR":
    System.out.println("HR Department");
    break;
    case "Management":
    System.out.println("Management Department");
    default:
    System.out.println("Invalid Department");
    
}

}
default: System.out.println("Enter correct number")
}
}
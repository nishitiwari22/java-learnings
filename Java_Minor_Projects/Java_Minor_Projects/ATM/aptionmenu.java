// package Edurkea1;

import java.io.IoException;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);    // Initialize Scanner to read input from the console
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");
    
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // Validate Login Info customer number and pin number

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try{
            data.put(123456, 1234);
            data.put(987654, 4321);

            System.out.println("Weclome to the ATM Project!");

            System.out.print("Enter your Customer Number:");
            setCustomerNumber(menuInput.nextInt());

            System.out.print("Enter Your Pin Number: ");
            setPinNumber(menuInput.nextInt());

            } catch (Exception e){
                System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
                x = 2; 
            }
            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber(), getAccountType());


            } 

        }

        System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
    } while (x == 1);

    // Display Account Type Menu With Selection

    public void getAccountType() {
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account ");
        System.out.println("Type 2 - Saving Account ");
        System.out.println("Type 3 - Exit ");
        System.out.println("Choice: ");

        switch (selection) {
        case 1:
            getChecking();
            break;

        case 2:
            getSaving():
            break;
            
        case 3: 
            System.out.println("\n" + "Invalid Choice" + "\n");
            getAccountType(); 
        }

    
    }

    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1: 
                System.out.println("Checking Account Balance: + moneyFormat.format(getChecking())");
                getAccountType();
                break;

            case 2: 
                getCheckingWithdrawInput();
                getAccountType();
                break;


            case 3: 
                getCheckingDepoistInput();
                getAccountType();
                break;

            case 4: 
                System.out.println("Thank you for using this ATM");
                getAccountType();
                break;

            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                getChecking();

        }


    }

    // Display Saving Account Meny With Selections 
    
    public void getSaving() {
        System.out.println("Savings Account ");
        System.out.println("Type 1 - Withdraw Funds ");
        System.out.println("Type 2 - Deposit Funds ");
        System.out.println("Type 3 - Exit ");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
        case 1:
            getChecking();
            break;

        case 2:
            getSaving():
            break;
            
        case 3: 
            System.out.println("\n" + "Invalid Choice" + "\n");
            getAccountType(); 
        }

    
    }

    public void getSavings() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1: 
                System.out.println("Checking Account Balance: + moneyFormat.format(getChecking())");
                getAccountType();
                break;

            case 2: 
                getCheckingWithdrawInput();
                getAccountType();
                break;


            case 3: 
                getCheckingDepoistInput();
                getAccountType();
                break;

            case 4: 
                System.out.println("Thank you for using this ATM");
                getAccountType();
                break;

            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                getChecking();

        }


    }


    }
package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> cars;
    // This is a dynamic array and so we don't need to define the size
    private List<Customer> customers;

    public CarRentalService() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCars(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer cust) {
        customers.add(cust);
    }

    public void options() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====== Welcome to our Car Rental System ===");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Available Car");
            System.out.println("4. Exit");

            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("== For Renting a Car please provide below details==");
                System.out.println("Enter your name: ");

                String custName = sc.nextLine();

                System.out.println("Enter the car ID you want to rent");
                String carId = sc.nextLine();

                System.out.println("Enter  the number of days for rent ");
                int days = sc.nextInt();

                Customer customer = new Customer("Customer-" + (customers.size() + 1), custName);
                addCustomer(customer);

                Optional<Car> optionalCar = cars.stream()
                        .filter(c -> c.getCarId().equalsIgnoreCase(carId) && c.getNoOfAvailableCar() > 0)
                        .findAny();

                if (optionalCar.isEmpty()) {
                    System.out.println("Car is not avialble. Please try to book another car ");
                    options();
                    return;
                }
                Car selectedCar = optionsCar.get();

                System.out.println("=== Bill Recepit === ");
                System.out.println("Customer ID: " + customer.getId());
                System.out.println("Customer Name: " + customer.getName());
                System.out.println("Customer Brand: " + selectedCar.getBrand() + " Model: ");
                System.out.println("Rental Days: " + days);
                System.out.println("Total Price: " + selectedCar.calculatePrice(days));

                System.out.println("Confirm Rental (Y/N): ");
                String confirmation = sc.next();

                // if (confirmation.equal)
    

            }
        }

    }

}

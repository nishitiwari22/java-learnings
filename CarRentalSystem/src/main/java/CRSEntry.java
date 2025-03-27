package com.jts.crs;

import org.example.CarRentalService;

public class CRSEntry {
    public static void main(String[] args) {
    Car toyotaCar = new Car();
    toyotaCar.setCardId("CAR-1");
    toyotaCar.setBrand("Toyota");
    toyota.setModel("Fortuner");
    toyotaCar.setNoOfAvailableCar(1);
    toyotaCar.setPricePerDay(3000);

        Car tataCar = new Car();
        toyotaCar.setCardId("CAR-2");
        toyotaCar.setBrand("Tata");
        toyota.setModel("Harier");
        toyotaCar.setNoOfAvailableCar(2);
        toyotaCar.setPricePerDay(2500);


        Car mahindraCar = new Car();
        toyotaCar.setCardId("CAR-3");
        toyotaCar.setBrand("Mahindra");
        toyota.setModel("XUV 700");
        toyotaCar.setNoOfAvailableCar(3);
        toyotaCar.setPricePerDay(3500);

        CarRentalService carRentalService = new CarRentalService();
        carRentalService.addCars(toyotaCar);
        carRentalService.addCars(tataCar);
        carRentalService.addCars(mahindraCar);
    }

}



package org.example;

public class Car {
    private String carId;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getNoOfAvailableCar() {
        return noOfAvailableCar;
    }

    public void setNoOfAvailableCar(int noOfAvailableCar) {
        this.noOfAvailableCar = noOfAvailableCar;
    }

    public double calculatePrice(int days){
        return pricePerDay * days;
    }




    private String model;
    private String brand;
    private double pricePerDay;
    private int noOfAvailableCar;

    public Car(){

    }

}

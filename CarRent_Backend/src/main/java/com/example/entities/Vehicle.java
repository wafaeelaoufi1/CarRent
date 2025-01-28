package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @Column(name = "Vehicle_ID")
    private int vehicleId;

    @Column(name = "Type")
    private String type;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Model")
    private String model;

    @Column(name = "Year")
    private int year;

    @Column(name = "Seating_Capacity")
    private int seatingCapacity;

    @Column(name = "Rental_Price_per_Day")
    private int rentalPricePerDay;

    @Column(name = "Availability")
    private String availability;

    @Column(name = "Owner_Email")
    private String Owner_Email;

    @Column(name = "Image")
    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(int rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getOwner_Email() {
        return Owner_Email;
    }

    public void setOwner_Email(String owner_Email) {
        Owner_Email = owner_Email;
    }
}
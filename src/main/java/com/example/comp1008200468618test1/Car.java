package com.example.comp1008200468618test1;

import java.util.ArrayList;

public class Car {
    public String make;
    public String model;
    public double price;
    public int year;

    public String getMake(){
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (1900 <= year && year <= 2023){
        this.year = year
    }else{
            IllegalArgumentException();
        }

}




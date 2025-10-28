package com.pluralsight.models;

import com.pluralsight.ui.Asset;

public class Vehicle extends Asset {
    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, int odometer, int year, String makeModel) {
        super(description, dateAcquired, originalCost);
        this.odometer = odometer;
        this.year = year;
        this.makeModel = makeModel;
    }



    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double value = 0;



        if(year >= 0 && year <= 3){
            value = originalCost * (1 - 0.03 * year);
        }else if(year >= 4 && year <= 6){
            value = originalCost * (1 - 0.06 * year);
        }else if(year >= 7 && year <= 10){
            value = originalCost * (1 - 0.08 * year);
        }else if(year > 10){
            value = 1000.0;
        }
        if(odometer > 100000){
            if (!makeModel.equalsIgnoreCase("honda") && !makeModel.equalsIgnoreCase("toyota")){
                value = value * 0.75;

            }
        }


       return  value;
    }
}

package com.pluralsight;

import com.pluralsight.models.*;
import com.pluralsight.ui.Asset;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Asset> models = new ArrayList<>();
    private static String message;
    private static int counter;

    public static void main(String[] args) {

        Asset newHouse = new House("Dream house", "today", 300000, "123 main st", 5, 2500, 6000);
        Asset newVehicle = new Vehicle("My car", "last month", 40000, 30000, 2, "Toyota");
        models.add(newHouse);
        models.add(newVehicle);


        models.add(new House("MY HOUSE", "yesterday", 5, "over there", 5, 42, 59));
        models.add(new House("Beach house", "last week", 250000, "beach ave", 4, 2000, 5000));
        models.add(new Vehicle("Toms truck", "tuesday", 5, 53, 2300, "Tesla"));
        models.add(new Vehicle("My car", "today", 50000, 120000, 5, "Honda"));


        //Example 1
        for (Asset asset : models) {
            counter++;

            if (asset instanceof House) {
                message = counter + " " + asset.getDescription() + " is located at " + ((House) asset).getAddress();
            } else if (asset instanceof Vehicle) {
                message = counter + " " + "This Vehicle is a " + ((Vehicle) asset).getMakeModel() + " and it is worth " + asset.getValue();
            }
            System.out.println(message);

        }

        //Example 2
        for (int i = 0; i < models.size(); i++) {
            counter++;
            if (models.get(i) instanceof House) {
                House house = (House) models.get(i);
                message = counter + " " + house.getDescription() + " is located at " + house.getAddress();

            } else if (models.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) models.get(i);
                message = counter + " " + "This Vehicle is a " + vehicle.getMakeModel() + " and it is worth " + vehicle.getValue();
            }
            System.out.println(message);
        }

        //Example 3
        for (int i = 0; i < models.size(); i++) {
            counter++;
            if (models.get(i) instanceof House house) {
                message = counter + " " + house.getDescription() + " is located at " + house.getAddress();
            } else if (models.get(i) instanceof Vehicle vehicle) {
                message = counter + " " + "This Vehicle is a " + vehicle.getMakeModel() + " and it is worth " + vehicle.getValue();
            }


            System.out.println(message);
        }

        // Example 4
        for (Asset model : models) {
            counter++;
            if (model instanceof House) {
                House house = (House) model;
                message = counter + " " + house.getDescription() + " is located at " + house.getAddress();

            } else if (model instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) model;
                message = counter + " " + "This Vehicle is a " + vehicle.getMakeModel() + " and it is worth " + vehicle.getValue();
            }
            System.out.println(message);
        }

        // Example 5
        for (Asset model : models) {
            counter++;
            if (model instanceof House house) {
                message = counter + " " + house.getDescription() + " is located at " + house.getAddress();

            } else if (model instanceof Vehicle vehicle) {
                message = counter + " " + "This Vehicle is a " + vehicle.getMakeModel() + " and it is worth " + vehicle.getValue();
            }
            System.out.println(message);
        }

    }
}

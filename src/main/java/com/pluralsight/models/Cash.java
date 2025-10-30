package com.pluralsight.models;

import com.pluralsight.ui.Asset;

public class Cash extends Asset {
    private static final int cashValue = 0;


    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return cashValue;
    }
}

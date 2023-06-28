package com.platzi.javatest.util.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double result = 0.0;
        result = prices.stream().collect(Collectors.summingDouble(i -> i));
        return result * ((100 -discount) / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
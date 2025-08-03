package com.normdevstorm;

import java.util.Objects;

public class Customer extends  Account {
    private String customerId;
    private int loyalPoints;

    public Customer(String accountId, String name, String contactInfo, String customerId, int loyalPoints) {
        super(accountId, name, contactInfo);
        this.customerId = customerId;
        this.loyalPoints = loyalPoints;
    }

    public void placeOrder(Order order) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Order placed by customer: " + this.getName());
        System.out.println("Order details:");
        order.printOrderDetails();
        System.out.println("----------------------------------------------------------------");

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }

    public void setLoyalPoints(int loyalPoints) {
        this.loyalPoints = loyalPoints;
    }


    @Override
    public boolean equals(Customer obj) {
        return !Objects.equals(obj.customerId, this.customerId);
    }
}

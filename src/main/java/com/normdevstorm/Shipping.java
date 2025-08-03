package com.normdevstorm;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Shipping implements PickupMethod {
    private String shippingAddress;
    private LocalDateTime deliveryDate;
    private String carrier;

    public Shipping(String shippingAddress, LocalDateTime deliveryDate, String carrier) {
        this.shippingAddress = shippingAddress;
        this.deliveryDate = deliveryDate;
        this.carrier = carrier;
    }

    public double calculateCostByKm(double distance){
        double baseCost = 5.00;
        double costPerKm = 5000;
        return baseCost + (costPerKm * distance);
    }

    public double calculateCostByAddressLevel(AddressLevel addressLevel){
        double baseCost = 5.00;
        return baseCost + Utility.getAdditionalCostOnAddressLevel(addressLevel);
    }

    @Override
    public boolean validateLocation() {
        return false;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}

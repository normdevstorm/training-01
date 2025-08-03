package com.normdevstorm;

import java.time.LocalDateTime;

public class PickupInStore implements PickupMethod {
    private String storeLocation;
    private LocalDateTime pickupTime;

    public PickupInStore(String storeLocation, LocalDateTime pickupTime) {
        this.storeLocation = storeLocation;
        this.pickupTime = pickupTime;
    }

    @Override
    public boolean validateLocation() {
        System.out.println("Validating store location: " + storeLocation);
        return true;
    }
}

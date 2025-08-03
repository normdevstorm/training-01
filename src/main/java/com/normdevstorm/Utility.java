package com.normdevstorm;

public class Utility {

    static double getAdditionalCostOnAddressLevel(AddressLevel addressLevel) {
        switch (addressLevel) {
            case ADDRESS_LEVEL_1:
                return 10000; // No additional cost for level 1
            case ADDRESS_LEVEL_2:
                return 20000; // Additional cost for level 2
            case ADDRESS_LEVEL_3:
                return 30000; // Additional cost for level 3
            default:
                throw new IllegalArgumentException("Invalid address level: " + addressLevel);
        }
    }
}

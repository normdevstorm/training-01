package com.normdevstorm;

public class Cash implements PaymentMethod {
    @Override
    public void processPayment() {

    }

    @Override
    public boolean verifyPayment() {
        return false;
    }
}

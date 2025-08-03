package com.normdevstorm;

public class Cash implements PaymentMethod {
    @Override
    public void processPayment() {
        // 1. Validate cash amount
        // 2. Process cash payment (Cashier or Shipper will handle cash)
    }

    @Override
    public boolean verifyPayment() {
        return false;
    }
}

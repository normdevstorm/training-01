package com.normdevstorm;

public class TraditionalStore extends Channel {
    private String address;
    private String operatingHours;
    private String contactNumber;

    public TraditionalStore(String channelId, String address, String operatingHours, String contactNumber) {
        super(channelId);
        this.address = address;
        this.operatingHours = operatingHours;
        this.contactNumber = contactNumber;
    }

    public void checkStockAvailability(String productId) {
        // Logic to check stock availability for a product
        System.out.println("Checking stock availability for product ID: " + productId);
    }

    @Override
    public void getChanelInfo() {
        System.out.println("Traditional Store Information: " +
                "\nAddress: " + address +
                "\nOperating Hours: " + operatingHours +
                "\nContact Number: " + contactNumber);
    }
}

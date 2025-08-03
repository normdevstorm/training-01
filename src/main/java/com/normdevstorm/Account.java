package com.normdevstorm;

public abstract class Account {
    private String accountId;
    private String name;
    private String contactInfo;


    public abstract boolean equals(Customer obj);

    public void updateProfile(String accountId, String name, String contactInfo){
        this.accountId = accountId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Account(String accountId, String name, String contactInfo) {
        this.accountId = accountId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void placeOder(){
        // TODO: Logic to place an order
    }

    public void cancelOrder(){
        // TODO: Logic to cancel an order
    }

    public void viewOrderHistory(){
        // TODO: Logic to view order history
    }

    public String getAccountId() {
        return accountId;
    }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

}

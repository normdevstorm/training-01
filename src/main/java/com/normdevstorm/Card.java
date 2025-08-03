package com.normdevstorm;

public class Card implements PaymentMethod {

    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String cardType;
    private String cardHolderName;

    public Card(String cardNumber, String expiryDate, String cvv, String cardType, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        // 1. Validate card details
        // 2. Process payment through payment gateway

    }

    @Override
    public boolean verifyPayment() {
        return false;
    }
}

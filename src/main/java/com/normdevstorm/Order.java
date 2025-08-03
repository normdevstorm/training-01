package com.normdevstorm;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private List<OrderItem> orderItems;
    private PickupMethod pickupMethod;
    private PaymentMethod paymentMethod;
    private Channel channel;


    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order(String orderId, LocalDateTime orderDate, OrderStatus orderStatus, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderItems =orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PickupMethod getPickupMethod() {
        return pickupMethod;
    }

    public void setPickupMethod(PickupMethod pickupMethod) {
        this.pickupMethod = pickupMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        channel.getChanelInfo();
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Order Items:");
        for (OrderItem item : orderItems) {
            System.out.printf(" - %s: %d x %.02f = %.02f%n", item.getProduct().getName(), item.getQuantity(), item.getProduct().getPrice(), item.getPrice());
        }
        System.out.printf("Total Price: %.02f\n", calculateTotalPrice());
        if (pickupMethod != null) {
            System.out.println("Pickup Method: " + pickupMethod.getClass().getSimpleName());
        }
        if (paymentMethod != null) {
            System.out.println("Payment Method: " + paymentMethod.getClass().getSimpleName());
        }
    }
}

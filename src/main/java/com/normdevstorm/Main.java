package com.normdevstorm;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("A01", "John Doe", "0392955340", "C01", 23);

        System.out.println("Customer ID: " + customer.getCustomerId());

        Channel channel = new LazadaChannel("C01", "Lazada",  "https://www.lazada.com.vn", "Jyz34k5d6f7g8h9i0j",  ShippingCostCalculationStrategy.ADDRESS_LEVEL_BASED, Map.of("key1", "value"));

        System.out.println("Customer is adding items to cart...");

        Product product_01 = new Product("P01", "Laptop", "Top-notch gaming laptop", 30000000, 100, List.of(Category.ELECTRONICS));
        OrderItem orderItem_01 = new OrderItem("OI01", product_01, 2);
        orderItem_01.calculateSubtotal();

        Product product_02 = new Product("P02", "Mobile", "Infinity display mobile", 10000000, 150, List.of(Category.ELECTRONICS));
        OrderItem orderItem_02 = new OrderItem("OI02", product_02, 1);
        orderItem_02.calculateSubtotal();

        Order order = new Order("001",  LocalDateTime.now(), OrderStatus.PENDING, List.of(orderItem_01, orderItem_02));
        order.setChannel(channel);
        double totalPrice = order.calculateTotalPrice();

        System.out.println("Customer is choosing pickup method...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose pickup method (1 for In-Store, 2 for Shipping): ");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Customer chose In-Store pickup.");
            // In reality, customer choose a store from a list of available stores
            defaultPickupMethod(order);
            break;
            case 2: 
            System.out.println("Customer chose Shipping.");
            Shipping shipping = new Shipping("123 St, Thanh pho Ha Tinh, Tinh Ha Tinh", LocalDateTime.now().plusDays(5), "Viettel Post");
            
            if(channel instanceof LazadaChannel) {
                totalPrice += shipping.calculateCostByAddressLevel(AddressLevel.ADDRESS_LEVEL_1);
            } else {
                totalPrice += shipping.calculateCostByKm(10.0);
            }

            order.setPickupMethod(shipping);
            break;
            default:  
            System.out.println("Invalid choice. Defaulting to In-Store pickup.");
                defaultPickupMethod(order);
        }

        System.out.printf("Total price: %.02f\n", totalPrice);

        System.out.println("Customer is choosing payment method...");
        System.out.println("Customer chose Card payment.");

        PaymentMethod paymentMethod = new Card("1234-5678-9012-3456", "12/29", "123", "Debit", "TCB");
        order.setPaymentMethod(paymentMethod);

        customer.placeOrder(order);

    }

    private static void defaultPickupMethod(Order order) {
        PickupInStore pickupInStore = new PickupInStore("Pickup location: Store 1, Address: 123 Main St", LocalDateTime.now().plusDays(3));
        order.setPickupMethod(pickupInStore);
    }
}
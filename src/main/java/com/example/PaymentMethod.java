package com.example;

public interface PaymentMethod {

    void pay();

    PaymentMethod card = () -> System.out.println("Payment made with card");
    PaymentMethod bankTransfer = () -> System.out.println("Payment made by bank transfer");

}

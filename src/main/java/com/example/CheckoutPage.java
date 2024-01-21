package com.example;

public class CheckoutPage {

    public void payForItems(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }

}

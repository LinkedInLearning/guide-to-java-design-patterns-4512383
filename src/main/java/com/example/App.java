package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        var atm = new UsDollarATM();
        atm.dispense(request);
    }

}

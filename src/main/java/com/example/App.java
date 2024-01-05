package com.example;

public class App {

    public static void main(String[] args) {

        var amount = 12;
        var request = new WithdrawalRequest(amount, WithdrawalRequest.Currency.USD);
        var ATM = new UsDollarATM();
        ATM.dispense(request);

    }

}

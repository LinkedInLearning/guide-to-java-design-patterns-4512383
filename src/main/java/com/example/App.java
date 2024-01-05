package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildAtmChain();
        atm.dispense(request);
    }

    private static ATM buildAtmChain() {
        var euroATM = new EuroATM(null);
        var usdATM = new UsDollarATM(euroATM);
        return usdATM;
    }

}

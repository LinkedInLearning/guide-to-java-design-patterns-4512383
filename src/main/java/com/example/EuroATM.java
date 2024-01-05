package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nextATN) {
        super(nextATN);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (nextATM != null) {
            nextATM.dispense(request);
        }
    }
}

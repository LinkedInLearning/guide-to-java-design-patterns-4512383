package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextAtm) {
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextATM != null) {
            nextATM.dispense(request);
        }
    }


}

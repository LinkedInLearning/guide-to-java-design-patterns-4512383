package com.example;

public class UsDollarATM extends ATM {

    @Override
    public void dispense(WithdrawalRequest request) {
        System.out.println("Dispensing $" + request.getAmount());
    }


}

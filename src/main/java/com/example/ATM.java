package com.example;

public abstract class ATM {

    public ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}

package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EuroATM extends ATM {

    @Override
    public void dispense(WithdrawalRequest request) {
        System.out.println("Dispensing €" + request.getAmount());
    }
}

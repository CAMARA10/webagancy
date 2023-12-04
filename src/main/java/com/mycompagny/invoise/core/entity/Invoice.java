package com.mycompagny.invoise.core.entity;

import org.springframework.context.annotation.Bean;

public class Invoice {

    private String number;
    private String customerName;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

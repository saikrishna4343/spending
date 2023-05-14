package com.spending.traxker.enums;

public enum PaymentFromType {
    CHECKINGS("checkings"),
    SAVINGS("savings"),
    DEBIT("debit"),
    CREDIT("credit");

    String description;

    PaymentFromType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}

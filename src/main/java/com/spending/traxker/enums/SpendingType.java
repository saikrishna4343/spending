package com.spending.traxker.enums;

public enum SpendingType {

    RENT("rent"),
    EAT_OUT("eat out"),
    GROCERIES("groceries"),
    GAS("gas"),
    TOLLS("tolls"),
    CAR("CAR"),
    INSURANCE("insurance"),
    CAR_INSURANCE("car insurance"),
    TV("TV"),
    PHONE("phone"),
    LEISURE("leisure");



    String description;

    SpendingType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

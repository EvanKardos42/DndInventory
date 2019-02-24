package com.example.dnd_inventory;

import java.security.PublicKey;

public class item {
    private String name,type,describtion;
    private int weight,amount,value;
    private boolean magical = false;

    public item(String name, String type, String describtion, int weight, int amount, int value, boolean magical) {
        this.name = name;
        this.type = type;
        this.describtion = describtion;
        this.weight = weight;
        this.amount = amount;
        this.value = value;
        this.magical = magical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isMagical() {
        return magical;
    }

    public void setMagical(boolean magical) {
        this.magical = magical;
    }
}

package com.javase.cxf.entity;

/**
 * Created by root on 11/27/16.
 */
public class Product {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private long id;

    private String name;

    private double price;

    @Override
    public String toString() {
        return "[" + id + " " + name + " " + price +  "]";
    }
}

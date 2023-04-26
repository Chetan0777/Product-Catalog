package com.productcatalog.model;

import java.text.NumberFormat;

public class Product {

    private String name;
    private double price;
    private String description;
    
    public Product() {
		super();
	}

	public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

	@Override
	public String toString() {
//		return "Product [name=" + name + ", price=" + price + ", description=" + description + "]";
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	    return String.format("%s (%s)", name, currencyFormat.format(price));
	
	}
	
    
}

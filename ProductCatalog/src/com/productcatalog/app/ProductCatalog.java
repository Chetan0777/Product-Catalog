package com.productcatalog.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.productcatalog.model.Product;

public class ProductCatalog {
	
	  public static void main(String[] args) {
		  
	        List<Product> productList = new ArrayList<>();

	        productList.add(new Product("SmartPhone", 10999.00, "6.7-inch Super Retina XDR display"));
	        productList.add(new Product("Laptop", 11199.99, "comes with 12GB of RAM. packs 512GB of SSD storage."));
	        productList.add(new Product("PC", 23399.00, "8-core processor operates memory at 2666MHz."));
	        productList.add(new Product("Speaker", 4999.99, "Quality sound is important for cinema experience,"));
	        productList.add(new Product("HeadPhone", 2299.00, "Noise cancelling headphones"));

	        Scanner scanner = new Scanner(System.in);
	        String sortBy;

	        do {
	        	System.out.println("=================================");
	            for (Product product : productList) {
	                System.out.println(product);
	            }
	            System.out.println("=================================");
	            System.out.println("\nSort by (name/price/search/exit): ");
	            sortBy = scanner.nextLine().toLowerCase();

	            if (sortBy.equals("name")) {
	            	System.out.println("\n");
	            	 System.out.println("Sorted Product By "+sortBy+" is :- ");
	                productList.sort(Comparator.comparing(Product::getName));
	            } else if (sortBy.equals("price")) {
	                productList.sort(Comparator.comparing(Product::getPrice));
	            } else if (sortBy.equals("search")) {
	                System.out.println("Enter search query: ");
	                String query = scanner.nextLine().toLowerCase();
	                List<Product> searchResults = new ArrayList<>();
	                for (Product product : productList) {
	                    if (product.getName().toLowerCase().contains(query)
	                            || product.getDescription().toLowerCase().contains(query)) {
	                        searchResults.add(product);
	                    }
	                }
	                if (searchResults.isEmpty()) {
	                    System.out.println("No matching products found.");
	                } else {
	                    System.out.println("Search results:");
	                    for (Product product : searchResults) {
	                    	System.out.println("================================");
	                        System.out.println(product);
	                    }
	                }
	              } else if (sortBy.equals("exit")) {
	                System.out.println("Exiting from the program.");
	                return;
	            } else {
	                System.out.println("Invalid sort option! Please enter a valid option.");
	            }
	        } while (true);
	    }

}

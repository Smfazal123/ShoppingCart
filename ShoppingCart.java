package com.tnsifDAY6;

import java.util.Scanner;

public class ShoppingCart {

	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        Products products = new Products();

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Add Product");
	            System.out.println("2. Display Products");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the product to add: ");
	                    String product = scanner.nextLine();
	                    products.addProductToList(product);
	                    System.out.println("Product added successfully.");
	                    break;
	                case 2:
	                    products.displayProductList();
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the application.");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
	            }
	        }
	    }

}
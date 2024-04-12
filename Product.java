package com.tnsifDAY6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Products {
    private List<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }

    public void displayProductList() {
        if (productList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            sortProductList();
            System.out.println("Products in alphabetical order:");
            for (String product : productList) {
                System.out.println(product);
            }
        }
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}





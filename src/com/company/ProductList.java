package com.company;
import java.util.ArrayList;
public class ProductList {
    ArrayList<Product> products;
    public ProductList() {
        products = new ArrayList<Product>();
        //hard code all the products
        products.add(new Product("first", 54.42, "first product", "george@fau.edu"));
    }

    public Product getProduct(String productName) {
        for (Product prod : products) {
            if (prod.name == productName) {
                return prod;
            }
        }
        return null;
        // raise exception
    }

    public ArrayList<Product> listProductsBySeller(String sellerName) {
        ArrayList<Product> list = new ArrayList<Product>();
        for (Product prod : products) {
            if (prod.seller == sellerName) {
                list.add(prod);
            }
        }
        return list;
        // raise exception if not found
    }
}

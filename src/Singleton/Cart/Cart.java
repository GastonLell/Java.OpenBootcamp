package Singleton.Cart;

import java.util.ArrayList;


public class Cart {

    private int amountTotal;
    private ArrayList<String> products = new ArrayList<String>();
    private ArrayList<String> productsWithPromotion = new ArrayList<String>();

    private static Cart cart;

    private Cart() {}

    public static Cart getInstance() {
        if(cart == null) {
            cart = new Cart();
        }
        return cart;
    }


    //GETTERS AND SETTERS
    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal += amountTotal;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void addProduct(String product) {
        this.products.add(product);
    }

    public ArrayList<String> getProductsWithPromotion() {
        return productsWithPromotion;
    }

    public void addProductWithPromotion(String product) {
        this.productsWithPromotion.add(product);
    }



}

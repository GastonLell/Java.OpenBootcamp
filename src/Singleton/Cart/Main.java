package Singleton.Cart;

public class Main {
    public static void main(String[] args){
        Cart myCart = Cart.getInstance();
        Cart myCartWithPromotions = Cart.getInstance();

        myCart.addProduct("Apple");
        myCart.setAmountTotal(5);

        myCartWithPromotions.addProductWithPromotion("Coffee");
        myCartWithPromotions.setAmountTotal(15);

        System.out.println("Cart without promotion");
        for(String product : myCart.getProducts()){
            System.out.println(product);
        }

        System.out.println("Cart with promotion");
        for(String product : myCartWithPromotions.getProductsWithPromotion()){
            System.out.println(product);
        }



        System.out.println("Precio final: " + myCart.getAmountTotal());

        //comparten la misma direccion de memoria
        System.out.println("Zona de memoria de myCart: " + myCart  + " Zona de memoria de myCartWithPromotions: " + myCartWithPromotions );
    }
}

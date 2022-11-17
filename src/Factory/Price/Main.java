package Factory.Price;

public class Main {
    public static void main(String[] args){
        FactoryPrice price = new FactoryPrice("España");
        System.out.println(price.getPrice());

        FactoryPrice price2 = new FactoryPrice("USA");
        System.out.println(price2.getPrice());

        FactoryPrice price3 = new FactoryPrice("UK");
        System.out.println(price3.getPrice());

    }
}

package Factory;

public class FactoryPrice {
    Price price;

    private FactoryPrice(){}

    public FactoryPrice(String country){
        if(country.equalsIgnoreCase("España")){
            System.out.println("España");
            this.price = new PriceEUR();
        } else if (country.equalsIgnoreCase("USA")){
            System.out.println("USA");
            this.price = new PriceUSD();

        } else if (country.equalsIgnoreCase("UK")){
            System.out.println("UK");
            this.price = new PriceGBP();
        }
    }

    public double getPrice(){
        return price.getPrice();
    }
}

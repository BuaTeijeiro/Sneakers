package edu.sneakers.items;

public class Sale implements Offer{
    String size;
    int sale;

    public Sale(String size, int sale){
        this.size = size;
        this.sale = sale;
    }
    @Override
    public String size(){
        return this.size;
    }
    @Override
    public Integer value(){
        return this.sale;
    }

    @Override
    public int compareTo(Offer otherOffer){
        return this.value().compareTo(otherOffer.value());
    }
}

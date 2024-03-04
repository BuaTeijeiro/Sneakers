package edu.sneakers.items;

public class Sale implements Offer{
    String size;
    int sale;

    Sale(String size, int sale){
        this.size = size;
        this.sale = sale;
    }

    public String size(){
        return this.size;
    }

    public int value(){
        return this.sale;
    }

}

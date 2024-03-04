package edu.sneakers.items;

public class Bid implements Offer{
    String size;
    int bid;

    Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    public String size(){
        return this.size;
    }

    public int value(){
        return this.bid;
    }
}

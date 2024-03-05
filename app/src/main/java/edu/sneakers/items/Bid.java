package edu.sneakers.items;

public class Bid implements Offer{
    String size;
    int bid;

    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }
    @Override
    public String size(){
        return this.size;
    }
    @Override
    public Integer value(){
        return this.bid;
    }

    @Override
    public int compareTo(Offer otherOffer){
        return this.value().compareTo(otherOffer.value());
    }

    @Override
    public String toString(){
        return "\n" + this.size() + "\t" + this.value();
    }
}

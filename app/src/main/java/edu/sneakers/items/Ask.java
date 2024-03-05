package edu.sneakers.items;

public class Ask implements Offer{
    String size;
    int ask;

    public Ask(String size, int ask){
        this.size = size;
        this.ask = ask;
    }
    @Override
    public String size(){
        return this.size;
    }

    @Override
    public Integer value(){
        return this.ask;
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

package edu.sneakers.items;

public class Ask implements Offer{
    String size;
    int ask;

    Ask(String size, int ask){
        this.size = size;
        this.ask = ask;
    }

    public String size(){
        return this.size;
    }

    public int value(){
        return this.ask;
    }

}

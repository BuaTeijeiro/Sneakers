package edu.sneakers.items;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private String style;
    private String name;
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private ArrayList<Offer> offers = new ArrayList<>();

    Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }

    public String getStyle(){
        return this.style;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public int getSale(){
        return this.sale;
    }
    @Override
    public int getAsk(){
        return this.ask;
    }
    @Override
    public int getBid(){
        return this.bid;
    }

    public void setStyle(String newStyle){
        this.style = newStyle;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    @Override
    public void setBid(int newBid){
        this.bid = newBid;
    }
    @Override
    public void setAsk(int newAsk){
        this.ask = newAsk;
    }

    @Override
    public void setSale(int newSale){
        this.sale = newSale;
    }

    @Override
    public List<Offer> offers(){
        return this.offers;
    }

    @Override
    public void add(Offer newOffer){
        this.offers().add(newOffer);
    }
}


package edu.sneakers.items;

public class Sneaker implements Item {
    String style;
    String name;
    int sale = 0;
    int ask = 0;
    int bid = 0;

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

    public int getSale(){
        return this.sale;
    }

    public int getAsk(){
        return this.ask;
    }

    public int getBid(){
        return this.bid;
    }

    public void setStyle(String newStyle){
        this.style = newStyle;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setBid(int newBid){
        this.bid = newBid;
    }

    public void setAsk(int newAsk){
        this.ask = newAsk;
    }

    public void setSale(int newSale){
        this.sale = newSale;
    }
}


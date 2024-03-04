package edu.sneakers.items;

public interface Offer {
    public String size();
    public Integer value();
    public int compareTo(Offer otherOffer);
}

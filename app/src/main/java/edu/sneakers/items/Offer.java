package edu.sneakers.items;

public interface Offer extends Comparable<Offer>{
    String size();
    Integer value();
    int compareTo(Offer otherOffer);
}

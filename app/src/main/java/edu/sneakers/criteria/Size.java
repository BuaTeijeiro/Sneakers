package edu.sneakers.criteria;
import java.util.ArrayList;

import edu.sneakers.items.*;
public class Size implements Criteria{
    String size;

    public Size(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        ArrayList<Offer> offers = item.offers();
        ArrayList<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer.size() == this.getSize()){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }
}

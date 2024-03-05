package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class Min implements Criteria {
    Criteria size;
    Criteria criteria;

    public Min(Criteria size, Criteria criteria){
        this.size = size;
        this.criteria = criteria;
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        AndCriteria sizeTypeFilter = new AndCriteria(size, criteria);
        ArrayList<Offer> sizeOffers = sizeTypeFilter.checkCriteria(item);
        ArrayList<Offer> min = new ArrayList<>();
        if (sizeOffers.isEmpty()){
            return min;
        } else{
            Offer bestOffer = sizeOffers.get(0);
            for (Offer offer: sizeOffers){
                bestOffer = offer.compareTo(bestOffer) < 0 ? offer : bestOffer;
            }
            min.add(bestOffer);
        }
        return min;
    }
}

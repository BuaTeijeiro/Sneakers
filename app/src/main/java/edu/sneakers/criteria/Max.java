package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class Max implements Criteria{
    Criteria size;
    Criteria criteria;

    public Max(Criteria size, Criteria criteria){
        this.size = size;
        this.criteria = criteria;
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        AndCriteria sizeTypeFilter = new AndCriteria(size, criteria);
        ArrayList<Offer> sizeOffers = sizeTypeFilter.checkCriteria(item);
        ArrayList<Offer> max = new ArrayList<>();
        if (sizeOffers.isEmpty()){
            return max;
        } else{
            Offer bestOffer = sizeOffers.get(0);
            for (Offer offer: sizeOffers){
                bestOffer = offer.compareTo(bestOffer) > 0 ? offer : bestOffer;
            }
            max.add(bestOffer);
        }
        return max;
    }
}

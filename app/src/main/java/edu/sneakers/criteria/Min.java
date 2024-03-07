package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

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
    public List<Offer> checkCriteria(Item item) {
        AndCriteria sizeTypeFilter = new AndCriteria(size, criteria);
        List<Offer> sizeOffers = sizeTypeFilter.checkCriteria(item);
        List<Offer> min = new ArrayList<>();
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

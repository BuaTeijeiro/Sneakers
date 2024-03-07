package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

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
    public List<Offer> checkCriteria(Item item) {
        AndCriteria sizeTypeFilter = new AndCriteria(size, criteria);
        List<Offer> sizeOffers = sizeTypeFilter.checkCriteria(item);
        List<Offer> max = new ArrayList<>();
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

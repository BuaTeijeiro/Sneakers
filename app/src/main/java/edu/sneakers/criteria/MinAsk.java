package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class MinAsk implements Criteria{
    
    public MinAsk(){
        //jen chci to delat, nech me bejt
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Asks asksFilter = new Asks();
        List<Offer> bids = asksFilter.checkCriteria(item);
        List<Offer> minAsk = new ArrayList<>();
        if (bids.isEmpty()){
            return minAsk;
        } else{
            Offer bestOffer = bids.get(0);
            for (Offer offer: bids){
                bestOffer = offer.compareTo(bestOffer) < 0 ? offer : bestOffer;
            }
            minAsk.add(bestOffer);
        }
        return minAsk;
    }
}

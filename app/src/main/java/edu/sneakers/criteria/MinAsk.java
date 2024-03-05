package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class MinAsk implements Criteria{
    
    public MinAsk(){
        //jen chci to delat, nech me bejt
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        Asks asksFilter = new Asks();
        ArrayList<Offer> bids = asksFilter.checkCriteria(item);
        ArrayList<Offer> minAsk = new ArrayList<>();
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

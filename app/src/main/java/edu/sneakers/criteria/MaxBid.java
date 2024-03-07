package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class MaxBid implements Criteria {
    public MaxBid(){
        //jen chci to delat, nech me bejt
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Bids bidsFilter = new Bids();
        List<Offer> bids = bidsFilter.checkCriteria(item);
        List<Offer> maxBid = new ArrayList<>();
        if (bids.isEmpty()){
            return maxBid;
        } else{
            Offer bestOffer = bids.get(0);
            for (Offer offer: bids){
                bestOffer = offer.compareTo(bestOffer) > 0 ? offer : bestOffer;
            }
            maxBid.add(bestOffer);
        }
        return maxBid;
    }
}

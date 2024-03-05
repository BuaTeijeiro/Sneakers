package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class MaxBid implements Criteria {
    public MaxBid(){
        //jen chci to delat, nech me bejt
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        Bids bidsFilter = new Bids();
        ArrayList<Offer> bids = bidsFilter.checkCriteria(item);
        ArrayList<Offer> maxBid = new ArrayList<>();
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

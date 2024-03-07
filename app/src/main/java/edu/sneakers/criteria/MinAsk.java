package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;
import edu.sneakers.items.Ask;

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
    /*    @Override
    public List<Offer> checkCriteria(Item item){
        return item.offers().stream().filter(a -> a instanceof Ask).sorted().f;

    }*/
}

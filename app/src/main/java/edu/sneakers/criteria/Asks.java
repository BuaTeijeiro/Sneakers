package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;
import edu.sneakers.items.Ask;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import edu.sneakers.items.*;

public class Asks implements Criteria{
    public Asks(){
        //Just because
    }
    /* 
    public List<Offer> checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Ask){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }*/

    @Override 
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(a -> a instanceof Ask).sorted().toList();
    }

}

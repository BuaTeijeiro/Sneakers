package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.sneakers.items.*;

public class Asks implements Criteria{
    public Asks(){
        //Just because
    }

    public List<Offer> checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Ask){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }

}

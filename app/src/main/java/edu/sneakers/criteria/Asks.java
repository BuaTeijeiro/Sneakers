package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.*;

public class Asks implements Criteria{
    public Asks(){
        //Just because
    }

    public ArrayList<Offer> checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        ArrayList<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Ask){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }

}

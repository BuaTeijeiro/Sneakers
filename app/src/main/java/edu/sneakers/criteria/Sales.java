package edu.sneakers.criteria;

import java.util.ArrayList;
import edu.sneakers.items.*;

public class Sales implements Criteria{
    public ArrayList checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        ArrayList<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Sale){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }

}

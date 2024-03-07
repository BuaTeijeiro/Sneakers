package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;
import edu.sneakers.items.*;

public class Sales implements Criteria{
    public Sales(){
        //Porque si
    }

    public List<Offer> checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Sale){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }

}

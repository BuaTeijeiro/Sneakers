package edu.sneakers.criteria;

import java.util.List;
import edu.sneakers.items.Sale;
import java.util.stream.Collectors;


import edu.sneakers.items.*;

public class Sales implements Criteria{
    public Sales(){
        //Porque si
    }
    /* 
    public List<Offer> checkCriteria(Item item){
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Sale){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }*/

    @Override
    public List<Offer> checkCriteria(Item item){
        return item.offers().stream().filter(a -> a instanceof Sale).collect(Collectors.toList());
    }
}

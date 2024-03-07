package edu.sneakers.criteria;


import java.util.List;
import java.util.Comparator;

import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;
import edu.sneakers.items.Bid;


public class Bids implements Criteria{
    public Bids(){
        //Je to jen prázdný, zádný problém
    }
    /*     @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Bid){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }*/
    @Override 
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(a -> a instanceof Bid).sorted(Comparator.reverseOrder()).toList();
    }

}

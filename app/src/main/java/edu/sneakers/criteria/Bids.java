package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.sneakers.items.Bid;
import edu.sneakers.items.Item;
import edu.sneakers.items.Offer;

public class Bids implements Criteria{
    public Bids(){
        //Je to jen prázdný, zádný problém
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> offers = item.offers();
        List<Offer> filteredOffers = new ArrayList<>();
        for (Offer offer: offers){
            if (offer instanceof Bid){
                filteredOffers.add(offer);
            }
        }
        return filteredOffers;
    }

}

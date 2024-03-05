package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.*;

public class LastSale implements Criteria {
    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        ArrayList<Offer> offers = item.offers();
        ArrayList<Offer> filteredOffers = new ArrayList<>();
        filteredOffers.add(offers.get(offers.size()-1));
        return filteredOffers;
    }
}

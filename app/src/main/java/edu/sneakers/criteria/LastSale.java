package edu.sneakers.criteria;

import java.util.ArrayList;

import edu.sneakers.items.*;

public class LastSale implements Criteria {
    public LastSale(){
        //porque si
    }

    @Override
    public ArrayList<Offer> checkCriteria(Item item) {
        Sales sales = new Sales();
        ArrayList<Offer> filteredSales = sales.checkCriteria(item);
        ArrayList<Offer> lastSale = new ArrayList<>();
        lastSale.add(filteredSales.get(filteredSales.size()-1));
        return lastSale;
    }
}

package edu.sneakers.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.sneakers.items.*;

public class LastSale implements Criteria {
    public LastSale(){
        //porque si
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Sales sales = new Sales();
        List<Offer> filteredSales = sales.checkCriteria(item);
        List<Offer> lastSale = new ArrayList<>();
        lastSale.add(filteredSales.get(filteredSales.size()-1));
        return lastSale;
    }
}

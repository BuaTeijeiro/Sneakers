package edu.sneakers.criteria;
import java.util.List;
import java.util.ArrayList;

import edu.sneakers.items.*;

public class AndCriteria implements Criteria{
    Criteria firsCriteria;
    Criteria secondCriteria;
    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria){
        this.firsCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstSelection = this.firsCriteria.checkCriteria(item);
        List<Offer> secondSelection = this.secondCriteria.checkCriteria(item);
        List<Offer> filteredList = new ArrayList<>();
        for (Offer offer: firstSelection){
            if(secondSelection.contains(offer)){
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

}

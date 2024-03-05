package edu.sneakers.criteria;
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
    public ArrayList<Offer> checkCriteria(Item item) {
        ArrayList<Offer> firstSelection = this.firsCriteria.checkCriteria(item);
        ArrayList<Offer> secondSelection = this.secondCriteria.checkCriteria(item);
        ArrayList<Offer> filteredList = new ArrayList<>();
        for (Offer offer: firstSelection){
            if(secondSelection.contains(offer)){
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

}

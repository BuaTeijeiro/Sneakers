package edu.sneakers.criteria;
import java.util.ArrayList;
import edu.sneakers.items.*;

public interface Criteria {
    public ArrayList<Offer> checkCriteria(Item item);
}

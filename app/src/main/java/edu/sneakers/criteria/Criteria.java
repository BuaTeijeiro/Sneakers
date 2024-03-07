package edu.sneakers.criteria;
import java.util.List;
import edu.sneakers.items.*;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}

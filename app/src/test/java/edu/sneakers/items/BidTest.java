package edu.sneakers.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BidTest {
    @Test
    public void constructorTest() {
        Bid bid = new Bid("9.5", 282);
        Integer value = 282;
        assertEquals(value, bid.value());
        assertEquals("9.5", bid.size());
    }

    @Test
    public void compareToTest(){
        Bid lowBid = new Bid("9.5", 282);
        Bid mediumBid = new Bid("9.5", 400);
        Bid mediumBidAgain = new Bid("9.5", 400);
        Bid highBid = new Bid("9.5", 600);
        assertTrue(mediumBid.compareTo(highBid) < 0);
        assertEquals(0, mediumBid.compareTo(mediumBidAgain));
        assertTrue(mediumBid.compareTo(lowBid) > 0);
    }
}

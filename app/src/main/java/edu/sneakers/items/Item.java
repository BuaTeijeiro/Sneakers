package edu.sneakers.items;

public interface Item {
    public int getBid();
    public int getAsk();
    public int getSale();
    public void setBid(int bids);
    public void setAsk(int asks);
    public void setSale(int sales);
}

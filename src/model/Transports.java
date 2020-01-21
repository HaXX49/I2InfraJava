package model;

public abstract class Transports {

    /**
     * 
     */
    public Double prices;

    /**
     * 
     */
    public Transports(){

    }

    /**
     * @return the prices
     */
    public Double getPrices() {
        return prices;
    }

    /**
     * @param prices the prices to set
     */
    public void setPrices(Double prices) {
        this.prices = prices;
    }

}
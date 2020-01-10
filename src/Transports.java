public abstract class Transports {

    /**
     * 
     */
    public Double prices;
    public String hours;

    /**
     * 
     */
    public Transports(){

    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @return the prices
     */
    public Double getPrices() {
        return prices;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @param prices the prices to set
     */
    public void setPrices(Double prices) {
        this.prices = prices;
    }

}
public class Waypoints{

    /**
     * 
     */
    public String name;
    public String address;
    public String period;
    public String description;
    public Double prices;
    public String hours;

    /**
     * 
     */
    public Waypoints(){

    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @return the prices
     */
    public Double getPrices() {
        return prices;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @param prices the prices to set
     */
    public void setPrices(Double prices) {
        this.prices = prices;
    }

} 


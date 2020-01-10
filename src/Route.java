import java.util.List;

public class Route {
    
    /**
     * 
     */
    public String startPoint;
    public String stopPoint;
    public List<Route> routes;
    public List<Waypoints> waypoints;

    /**
     * 
     */
    public Route(){

    }

    /**
     * @return the startPoint
     */
    public String getStartPoint() {
        return startPoint;
    }

    /**
     * @return the stopPoint
     */
    public String getStopPoint() {
        return stopPoint;
    }

    /**
     * @return the waypoints
     */
    public List<Waypoints> getWaypoints() {
        return waypoints;
    }

    /**
     * @return the routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * @param startPoint the startPoint to set
     */
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * @param stopPoint the stopPoint to set
     */
    public void setStopPoint(String stopPoint) {
        this.stopPoint = stopPoint;
    }

    /**
     * @param routes the routes to set
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     * @param waypoints the waypoints to set
     */
    public void setWaypoints(List<Waypoints> waypoints) {
        this.waypoints = waypoints;
    }
}
public class Reservation {

    private String tripType;
    private int distance;
    private String departureTime;
    private String arrivalTime;
    private String busType;
    private boolean food;

    public Reservation(String tripType, int distance, String departureTime, String arrivalTime, String busType, boolean food) {
        this.tripType = tripType;
        this.distance = distance;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.busType = busType;
        this.food = food;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public String toString() {
        return "Trip type: " + this.tripType + ", distance: " + this.distance + ", departure time: " + this.departureTime + ", arrival time: " + this.arrivalTime + ", bus type: " + this.busType + ", food: " + this.food;
    }
}

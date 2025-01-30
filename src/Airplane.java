
public class Airplane {

    private String airplaneType;
    private int currentPassengerCount;
    private int currentAltitude; // in feet
    private double currentSpeed; // in knots

    public Airplane(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getAirplaneType() {
        return this.airplaneType;
    }

    public int getCurrentPassengerCount() {
        return currentPassengerCount;
    }

    public int getCurrentAltitude() {
        return currentAltitude;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void start(double targetSpeed) {
        this.currentSpeed = targetSpeed;
    }

    public void land() {
        this.currentAltitude = 0;
        this.currentSpeed = 0;
    }

    public void flight(int newAltitude, double newSpeed) {
        this.currentAltitude = newAltitude;
        this.currentSpeed = newSpeed;
    }

    public int boarding(int passengers) {
        this.currentPassengerCount += passengers;
        return this.currentPassengerCount;
    }
}
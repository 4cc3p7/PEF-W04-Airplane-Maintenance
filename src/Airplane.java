import java.time.LocalDateTime;

public class Airplane {

    private String airplaneType;
    private int currentPassengerCount;
    private int currentAltitude; // in feet
    private double currentSpeed; // in knots
    private LocalDateTime lastMaintenance;
    private double totalLuggageWeight = 0.0;

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

    public double getTotalLuggageWeight() {
        return totalLuggageWeight;
    }

    public void loadLuggage(luggage luggage){
        this.totalLuggageWeight += luggage.getWeight();
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

    public LocalDateTime getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(LocalDateTime lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }
}
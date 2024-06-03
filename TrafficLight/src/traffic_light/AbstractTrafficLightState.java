package traffic_light;

public class AbstractTrafficLightState implements TrafficLightState{

    private final TrafficLight trafficLight;

    public AbstractTrafficLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }


    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Häh");
    }

    @Override
    public void nextColor() {
        throw new UnsupportedOperationException("Häh");
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    @Override
    public void switchOn() {
        throw new UnsupportedOperationException("Häh");
    }

    @Override
    public void switchOff() {
        throw new UnsupportedOperationException("Häh");
    }
}

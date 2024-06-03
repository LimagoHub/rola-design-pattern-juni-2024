package traffic_light;

public class RedState extends AbstractColorState{
    public RedState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getColor() {
        return "RED";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().green;
    }
}

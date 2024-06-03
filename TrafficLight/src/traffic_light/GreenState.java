package traffic_light;

public class GreenState extends AbstractColorState{
    public GreenState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getColor() {
        return "GREEN";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().red;
    }
}

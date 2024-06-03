package traffic_light;

public class AbstractColorState extends AbstractTrafficLightState{
    public AbstractColorState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void switchOff() {
        getTrafficLight().current = getTrafficLight().off;
    }
}

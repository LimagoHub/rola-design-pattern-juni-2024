package traffic_light;

public interface TrafficLightState {

    String getColor();
    void nextColor();
    void switchOn();
    void switchOff();
}

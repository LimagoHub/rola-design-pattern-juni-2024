package events;

public class PropertyChangedEvent {

    private final Object source;
    private final String propertyName;
    private final Object oldValue;
    private final Object newValue;

    public PropertyChangedEvent(final Object source, final String propertyName, final Object oldValue, final Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Object getSource() {
        return source;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyChangedEvent{");
        sb.append("source=").append(source);
        sb.append(", propertyName='").append(propertyName).append('\'');
        sb.append(", oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append('}');
        return sb.toString();
    }
}
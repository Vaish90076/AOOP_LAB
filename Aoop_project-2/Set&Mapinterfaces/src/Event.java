class Event {
    private String eventName;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventName.equals(event.eventName);
    }

    @Override
    public int hashCode() {
        return eventName.hashCode();
    }
}
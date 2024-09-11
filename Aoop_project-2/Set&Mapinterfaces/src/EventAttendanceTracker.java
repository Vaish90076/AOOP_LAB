import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventAttendanceTracker {
    private Map<Event , Set<Attendee>> eventAttendance;

    public EventAttendanceTracker() {
        eventAttendance = new HashMap<>();
    }

    public void registerAttendee(Event event, Attendee attendee) {
        eventAttendance.putIfAbsent(event, new HashSet<>());
        eventAttendance.get(event).add(attendee);
    }

    public Set<Attendee> getAttendeesForEvent(Event event) {
        return eventAttendance.getOrDefault(event, new HashSet<>());
    }

    public Set<Event> getEventsForAttendee(Attendee attendee) {
        Set<Event> attendedEvents = new HashSet<>();
        for (Map.Entry<Event, Set<Attendee>> entry : eventAttendance.entrySet()) {
            if (entry.getValue().contains(attendee)) {
                attendedEvents.add(entry.getKey());
            }
        }
        return attendedEvents;
    }
}


public class Main {
    public static void main(String[] args) {
        EventAttendanceTracker tracker = new EventAttendanceTracker();

        Event event1 = new Event("Java Conference");
        Event event2 = new Event("Tech Expo");

        Attendee attendee1 = new Attendee("Alice");
        Attendee attendee2 = new Attendee("Bob");

        tracker.registerAttendee(event1, attendee1);
        tracker.registerAttendee(event1, attendee2);
        tracker.registerAttendee(event2, attendee1);

        System.out.println("Attendees for Java Conference: " + tracker.getAttendeesForEvent(event1));
        System.out.println("Events attended by Alice: " + tracker.getEventsForAttendee(attendee1));
    }
}

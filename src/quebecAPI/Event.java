package quebecAPI;

import java.util.ArrayList;

/**
 *
 * Event: this class holds the concept of an event, party etc
 *        it holds event details, attendees and video from the event
 */
public class Event {
    private EventDetails eventDetails;
    private ArrayList<User> eventAttendees;
    private ArrayList<Video> eventVideos;

    Event(EventDetails eventDetails, ArrayList<User> eventAttendees, ArrayList<Video> eventVideos) {
        this.eventAttendees = eventAttendees;
        this.eventDetails = eventDetails;
        this.eventVideos = eventVideos;
    }

}

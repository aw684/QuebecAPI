package quebecAPI;

/**
 * EventConfirmation: this is used by UserManager to return back to the client with the event and any errors.
 */
public class EventConfirmation {
    private Event event;
    private Error error;

    EventConfirmation(Event event, Error error) {
        this.event = event;
        this.error = error;
    }
}

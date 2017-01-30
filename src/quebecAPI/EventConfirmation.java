package quebecAPI;

/**
 * EventConfirmation: this is used by UserManager to return back to the client with the event and any errors.
 */
public class EventConfirmation extends Confirmation {
    private Event event;

    EventConfirmation(Event event, Error err, boolean bool) {
        super(err, bool);
        this.event = event;

    }
}

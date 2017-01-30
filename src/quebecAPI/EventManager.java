package quebecAPI;

/**
 *
 */
public class EventManager {
    private Event event;

    EventManager (Event event) {
        this.event = event;
    }

    /**
     * This involves creating new event in the database, given a Event instance
     * @return
     */
    public EventConfirmation addNewEvent() {

        return new EventConfirmation();
    }


}

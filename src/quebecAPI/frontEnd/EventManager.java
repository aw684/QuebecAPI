package quebecAPI.frontEnd;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class EventManager {
    // Cache of IDs to objects
    private HashMap<String, Event> events;

    /*
        Singleton model
     */
    private static EventManager instance;
    private EventManager(){};

    /*
        Get a shared EventManager initialised with the logged in user
     */
    public static EventManager getInstance(){return null;};

    /*
        Creates a new event
     */
    public abstract void createNewEvent(String name, File video, Object location, Callback<Event> callback);

    /*
        Adds a user to an event
        Returns true on success
     */
    public abstract void addUserToEvent(User user, Event event, Callback<Boolean> callback);

    /*
        Removes a user from an event
        Returns true on success
     */
    public abstract void removeUserFromEvent(User user, Event event, Callback<Boolean> callback);

    /*
        Returns events based off their IDs
     */
    public abstract void getEvent(String[] id, Callback<ArrayList<Event>> callback);
}

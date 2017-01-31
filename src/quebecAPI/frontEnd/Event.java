package quebecAPI.frontEnd;

import java.util.ArrayList;

public abstract class Event {
    private String eventID;
    private String videoLink;
    private ArrayList<String> attendedUsers;
    private boolean finishedProcessing;
}

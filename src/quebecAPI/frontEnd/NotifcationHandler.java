package quebecAPI.frontEnd;

public abstract class NotifcationHandler {

    public abstract void newEvent(Event event);

    public abstract void newFriendRequest(User friend);

    public abstract void eventFinishedProcessing(Event event);
}

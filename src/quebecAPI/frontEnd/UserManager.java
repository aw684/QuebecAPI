package quebecAPI.frontEnd;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class UserManager {
    // Cache of IDs to objects
    private HashMap<String, User> users;

    /*
        Singleton model
     */
    private static UserManager instance;
    private UserManager(){};

    /*
        Get a shared UserManager initialised with the logged in user
     */
    public static UserManager getInstance(){return null;};

    /*
        Creates a new user
     */
    public abstract void createNewUser(String name, File photo, Callback<User> callback);

    /*
        Returns users based off their IDs
     */
    public abstract void getUser(String[] id, Callback<ArrayList<User>> callback);

    /*
        Send a friend request
        Returns true if successful API call
     */
    public abstract void addFriend(String userID, Callback<Boolean> callback);

    /*
        Respond to a friend request
        Returns true if successful API call
     */
    public abstract void respondToFriendRequest(String userID, boolean accept, Callback<Boolean> callback);
}

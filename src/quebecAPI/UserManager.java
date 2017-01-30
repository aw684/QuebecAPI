package quebecAPI;

/**
 *
 *
 * UserManager is made to create a User instance, return data from a User instance
 * or mutate the data of a User instance, so that any requests from the client are sent to a UserManager
 */
public class UserManager {
    private User user;
    /**
     * addNewUser: endpoint to take a UserDetails instance, and create a new User in the database
     *             returning a UserConfirmation object
     */

    public UserConfirmation createNewUser(UserDetails userDetails) {
        return null;
    }

    /**
     * forwardFriendRequest: endpoint to accept a FriendRequest instance, add it to the DB and forward it to the user
     *                      as a notification
     */

    public UserConfirmation forwardFriendRequest(FriendRequest friendRequest) {
        return null;
    }

    /**
     * acceptRequest: endpoint for the user to accept a friend request
     *                  takes the FriendRequest instance,
     */
    public UserConfirmation acceptRequest(FriendRequest friendRequest) {
        return null;
    }




}

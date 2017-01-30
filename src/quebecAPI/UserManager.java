package quebecAPI;

/**
 *
 *
 * UserManager is made to create a User instance, return data from a User instance
 * or mutate the data of a User instance, so that any requests from the client are sent to a UserManager
 */
public interface UserManager {
    /**
     * addNewUser: take a UserDetails instance, and create a new User in the database
     *             returning a UserConfirmation object
     */

    public UserConfirmation createNewUser(User user);

    /**
     * forwardFriendRequest: accept a FriendRequest instance and forward it to the user
     */

    public UserConfirmation forwardFriendRequest(FriendRequest friendRequest);





}

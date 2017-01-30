package quebecAPI;

/**
 *  UserConfirmation is a subclass of Confirmation, and holds an instance of the User object
 *  on which the operation was performed
 */
public class UserConfirmation extends Confirmation {
    private User user;
    UserConfirmation(User user, Error err, boolean bool) {
        super(err, bool);
        this.user = user;

    }
}

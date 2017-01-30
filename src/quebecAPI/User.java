package quebecAPI;

/**
 *  User: encapsulates all the information about a user of the website. Created by a UserManager
 */
public class User {
    private UserDetails userDetails;

    User (UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}

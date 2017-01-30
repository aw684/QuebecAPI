package quebecAPI;

/**
 * Confirmation: instance of Confirmation is sent back to user to services layer
 *              encapsulates success or failure of a particular action.
 */
public class Confirmation {
    private boolean success;
    private Error error;

    Confirmation(Error error, boolean result) {
        if(!result) {
            this.error = error;
        } else {
            this.error = null;
        }
    }
}

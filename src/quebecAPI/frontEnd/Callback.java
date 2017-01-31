package quebecAPI.frontEnd;

public abstract class Callback<T> {

    // Called when an API request fails
    public abstract void requestFailed(String errorInfo);

    // Called when an API succeeds with the relevant data
    public abstract void success(T response);
}

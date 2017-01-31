package quebecAPI.backend;

public abstract class LambdaAPIFunctions {

    /*
        Creates a new event
        Input
            eventName : string
            videoID : used for locating video in S3
            creatorID : creator user ID
            location : string
        Output
            eventID : unique event ID
            processingStatus : IN_PROGRESS / FINISHED
            error : string
     */
    public abstract String createEvent(String request);

    /*
        Creates a user, starts face learning process
        (Authentication handled by Cognito, this is our db entry)
        Input
            name : string
            photoID : used for locating photo in S3
        Output
            status : success / error
            error : string
     */
    public abstract String createUser(String request);

    /*
        Changes a users membership to an event, notification on add
        Input
            userID : string
            eventID : used for locating photo in S3
            shouldRemove : bool
        Output
            status : success / error
            error : string
     */
    public abstract String changeUserEventMembership(String request);

    /*
        Get users info for multiple user IDs
        Input
            userIDs : string array
        Output
            users : array
                name : string
                userID : string
                photoID : string, link to s3
                eventIDs : string array
                friendIDs : string array
            error : string
     */
    public abstract String getUsers(String request);

    /*
        Get users info for multiple event IDs
        Input
            eventIDs : string array
        Output
            events : array
                name : string
                videoID : string, link to s3
                processingStatus : string
                memberIDs : string array
            error : string
     */
    public abstract String getEvents(String request);

    /*
        Send a friend request
        Input
            userID : string
        Output
            error : string
     */
    public abstract String sendFriendRequest(String request);

    /*
        Respond to a friend request
        Input
            userID : string
            confirm : bool
        Output
            error : string
     */
    public abstract String respondToFriendRequest(String request);

    /*
        Update the databse and notify people when an event has been processed
        Input
            eventID : string
            detectedMemberIDs : string array
        Output
            error : string
     */
    public abstract String videoFinishedProcessing(String request);
}

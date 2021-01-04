package communication;

/**
 * Represents the content of the message sent to the server.
 */
public class ServerMessage {
    private int steps;
    private int clientid;
    private long timestamp;

    public ServerMessage(int steps, int clientid, long timestamp) {
        this.steps = steps;
        this.clientid = clientid;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                "steps=" + steps +
                ", clientid=" + clientid +
                ", timestamp=" + timestamp +
                '}';
    }
}

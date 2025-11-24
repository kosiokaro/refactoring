package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private String playId;
    private int audience;

    /**
     * Constructs a Performance.
     * @param playId the ID of the play being performed
     * @param audience the size of the audience
     */

    public Performance(String playId, int audience) {
        this.playId = playId;
        this.audience = audience;
    }

    public String getPlayId() {
        return playId;
    }

    public int getAudience() {
        return audience;
    }
}

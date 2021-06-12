package models;

public class Session {
    private static Long lastSessionId = 0L;
    private Long sessionId;
    private int durationSession;
    private Boolean completed;
    private int ratingSession;
    private Period has;

    public Session(Period period){
        this.has = period;
    }

    public static Session createSession(){
        return null;
    }
    public void rateSession(int rate){
        this.ratingSession = rate;
    }
}

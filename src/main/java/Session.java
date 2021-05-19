import java.util.Calendar;
import java.util.GregorianCalendar;

public class Session {


    private Calendar startSession;
    private Calendar endSession;
    private boolean completed;
    private Long lastSessionId = 0L;
    private Long sessionId;
    private int ratingSession;

    Session(int year, int month, int day) {
        int hour = 12;
        int minute = 0;
        this.startSession = new GregorianCalendar(year, month, day, hour, minute);
        this.endSession = new GregorianCalendar(year, month, day, hour + 1, minute);
    }

    public Calendar getStartSession() {
        return startSession;
    }

    public Calendar getEndSession() {
        return endSession;
    }


}

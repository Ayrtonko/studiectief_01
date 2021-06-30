package model;

public abstract class ISession {
    protected int durationSession;
    protected Boolean completed;

    public abstract Session createSession();
}

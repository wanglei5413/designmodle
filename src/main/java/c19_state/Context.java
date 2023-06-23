package c19_state;


public interface Context {

    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recoredLog(String msg);

}

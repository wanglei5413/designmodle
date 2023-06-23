package c19_state;

public class DayState implements State{
    private static State state=new DayState();

    private DayState() {
    }

    public static  State getInstance(){
        return state;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour <9 || hour>17){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recoredLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}

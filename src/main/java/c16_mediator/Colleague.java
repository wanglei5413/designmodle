package c16_mediator;

/**
 * 同事接口
 */
public interface Colleague {
    public void setMediator(Mediator mediator);
    public void setColleagueEnabled(boolean enabled);

}

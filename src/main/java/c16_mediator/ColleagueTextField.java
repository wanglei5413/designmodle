package c16_mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled?Color.WHITE:Color.LIGHT_GRAY);
    }

    @Override
    public void textValueChanged(TextEvent e) {//textListener回调的事件通知接口
        mediator.colleagueChanged();
    }
}

package c19_state;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context, ActionListener {
    private TextField  textClock=new TextField(60);
    private TextArea  textScreen =new TextArea(10,60);
    private JButton buttonUse =new JButton("使用金库");
    private JButton buttonAlarm =new JButton("按下警铃");
    private JButton buttonPhone =new JButton("正常通话");
    private JButton buttonExit =new JButton("结束");

    private State state=DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock,BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel,BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clockString="现在时间是：";
        if (hour<10) {
            clockString += "0" + hour + ":00";
        }else {
            clockString+=hour+":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this,hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变成了" + state + "状态");
        this.state=state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! "+msg+"\n");
    }

    @Override
    public void recoredLog(String msg) {
        textScreen.append("recording... "+msg+"\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource()==buttonUse) {
            state.doUse(this);
        }else if(e.getSource()==buttonAlarm) {
            state.doAlarm(this);
        }else if(e.getSource()==buttonPhone) {
            state.doPhone(this);
        }else if(e.getSource()==buttonExit) {
            System.exit(0);
        }else {
            System.out.println("?");
        }
    }
}

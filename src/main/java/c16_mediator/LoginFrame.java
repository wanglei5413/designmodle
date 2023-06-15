package c16_mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;


    public LoginFrame(String title) throws HeadlessException {
        super(title);

        //设置背景色
        setBackground(Color.lightGray);
        //设置布局管理器（4行2列窗格）
        setLayout(new GridLayout(4,2));

        //生成colleague
        createColleagues();

        //增加组件
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username"));
        add(textUser);
        add(new Label("Password"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        //设置组件初始启用状态
        colleagueChanged();

        //显示
        pack();
        show();
    }

    @Override
    public void createColleagues() {

        //生成
        CheckboxGroup group = new CheckboxGroup();
         checkGuest=new ColleagueCheckbox("Guset", group, true);
         checkLogin=new ColleagueCheckbox("Login", group, false);

         textUser=new ColleagueTextField("",10);
         textPass=new ColleagueTextField("",10);
         textPass.setEchoChar('*');

         buttonOk=new ColleagueButton("OK");
         buttonCancel=new ColleagueButton("Cancel");

         //设置mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        //设置listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }else{
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if (textUser.getText().length()>0){
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length()>0){
                buttonOk.setColleagueEnabled(true);
            }else {
                buttonOk.setColleagueEnabled(false);
            }
        }else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}

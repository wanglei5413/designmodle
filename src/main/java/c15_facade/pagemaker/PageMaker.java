package c15_facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import static c15_facade.pagemaker.Database.BASE_PATH;

/**
 * 高层的api
 * 使用Database和HtmlWriter生成指定用户的web页面
 */
public class PageMaker {
    public static void makeWelcomePage(String mailAddr,String fileName){
        Properties properties = Database.getProperties("maildata");
        String userName = properties.getProperty(mailAddr);
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(BASE_PATH+fileName));
            htmlWriter.title("Welcome to "+userName+"`s page");
            htmlWriter.paragraph(userName+"欢迎来到"+userName+"的主页");
            htmlWriter.paragraph("等你的邮件哦");
            htmlWriter.mailto(mailAddr,userName);
            htmlWriter.close();
            System.out.println(fileName + " is created for " + mailAddr + "(" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

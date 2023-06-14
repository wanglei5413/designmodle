package c15_facade.pagemaker;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 从数据文件中获取所有的邮箱对应的用户名
 *
 */
public class Database {

    public final static String BASE_PATH="D:\\idea-projects\\designmodle\\src\\main\\java\\c15_facade\\";

    public static Properties getProperties(String dbName){
        File file = new File(BASE_PATH+dbName+".txt");
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}

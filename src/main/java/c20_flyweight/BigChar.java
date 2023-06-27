package c20_flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Flyweight角色
 * 表示大型字符
 */
public class BigChar {

    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        String path="bigs";
        BufferedReader reader=null;


        try {
            URL resource = this.getClass().getClassLoader().getResource(path + "/big" + charName + ".txt");
            reader = new BufferedReader(
                    new FileReader(resource.getPath())
            );

            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line=reader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
            }
            fontData=stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void print(){
        System.out.println(fontData);
    }
}

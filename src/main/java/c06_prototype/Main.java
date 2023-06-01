package c06_prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        //注册原型
        UnderlinePen ulProto = new UnderlinePen('~');
        manager.register("underline", ulProto);

        MessageBox mbProto = new MessageBox('*');
        manager.register("messagebox",mbProto );
        //克隆原型
        Product underline = manager.createClone("underline");
        Product messagebox = manager.createClone("messagebox");

        underline.use("hello,world");
        messagebox.use("hello,world");




    }
}

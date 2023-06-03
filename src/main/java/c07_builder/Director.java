package c07_builder;

/**
 * 监工
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("greetings");
        builder.makeString("从早上到下午");
        builder.makeItem(new String[]{
                "早上好",
                "下午好",
        });

        builder.makeString("晚上");
        builder.makeItem(new String[]{
                "晚上好",
                "晚安",
                "再见",
        });
        builder.close();
    }
}

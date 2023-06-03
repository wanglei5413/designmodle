package c07_builder;

/**
 * text文档建造者
 */
public class TextBuilder extends Builder {
    private StringBuilder buffer  =new StringBuilder();

    @Override
    public void makeTitle(String title) {
        buffer.append("=============================\n");
        buffer.append("[ ").append(title).append(" ]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("*").append(str).append("\n\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=============================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}

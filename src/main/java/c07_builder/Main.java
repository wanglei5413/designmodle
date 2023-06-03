package c07_builder;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());

        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director1 = new Director(htmlBuilder);
        director1.construct();
        htmlBuilder.getResult();

    }
}

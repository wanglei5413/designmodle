package c11_composite;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin).add(tmp).add(usr);
        File vi = new File("vi", 10000);
        File latex = new File("latex", 20000);
        bin.add(vi).add(latex);
        root.printList();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        Directory yuki = new Directory("yuki");
        usr.add(yuki);
        File diary = new File("diary.html", 100);
        File composite = new File("Composite.java", 200);
        yuki.add(diary).add(composite);

        Directory hanako = new Directory("hanako");
        usr.add(hanako);
        File memo = new File("memo.tex", 300);
        hanako.add(memo);

        Directory tomura = new Directory("tomura");
        usr.add(tomura);
        File game = new File("game.doc", 400);
        File junk = new File("junk.mai", 500);
        tomura.add(game).add(junk);
        root.printList();

    }
}

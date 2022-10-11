package net.yury.P02AbstractFactory;

public class Main {
    public static void main(String[] args) {
        String md = "md";
        final FastFactory fastFactory = new FastFactory();
        fastFactory.getHtmlDocument().toHtml(md);
        fastFactory.getWordDocument().toWord(md);

        final GoodFactory goodFactory = new GoodFactory();
        goodFactory.getHtmlDocument().toHtml(md);
        goodFactory.getWordDocument().toWord(md);
    }
}

package net.yury.P02AbstractFactory;

public class FastFactory extends AbstractFactory {
    @Override
    public HtmlTransformer getHtmlDocument() {
        return new FastHtmlTransformer();
    }

    @Override
    public WordTransformer getWordDocument() {
        return new FastWordTransformer();
    }

    public final static class FastHtmlTransformer implements HtmlTransformer {

        @Override
        public String toHtml(String md) {
            System.out.println("md fast to html => " + md);
            return null;
        }
    }

    public final static class FastWordTransformer implements WordTransformer {

        @Override
        public String toWord(String md) {
            System.out.println("md fast to word => " + md);
            return null;
        }
    }
}


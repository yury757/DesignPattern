package net.yury.P02AbstractFactory;

public class GoodFactory extends AbstractFactory {
    @Override
    public HtmlTransformer getHtmlDocument() {
        return new GoodHtmlTransformer();
    }

    @Override
    public WordTransformer getWordDocument() {
        return new GoodWordTransformer();
    }

    public final static class GoodHtmlTransformer implements HtmlTransformer {

        @Override
        public String toHtml(String md) {
            System.out.println("md Good to html => 【" + md + "】");
            return null;
        }
    }

    public final static class GoodWordTransformer implements WordTransformer {

        @Override
        public String toWord(String md) {
            System.out.println("md Good to word => 【" + md + "】");
            return null;
        }
    }
}
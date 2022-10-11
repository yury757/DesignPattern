package net.yury.P02AbstractFactory;

public abstract class AbstractFactory {
    public abstract HtmlTransformer getHtmlDocument();
    public abstract WordTransformer getWordDocument();
}

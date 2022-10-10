package net.yury.P10Facade;

public class Main {
    public static void main(String[] args) {
        // 初始化一个外观类，就可以使用该接口的所有实现类的功能
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

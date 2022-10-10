package net.yury.P06Bridge;

public class Main {
    public static void main(String[] args) {
        final DrawAPI redCircle = new RedCircle();
        final DrawAPI greenCircle = new GreenCircle();
        final Circle circle = new Circle(redCircle, 1, 2, 3);
        circle.draw();
        final Circle circle2 = new Circle(greenCircle, 10, 20, 30);
        circle2.draw();
    }
}

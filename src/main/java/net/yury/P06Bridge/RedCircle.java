package net.yury.P06Bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("RedCircle drawing[radius=" + radius + ";x=" + x + ";y=" + y + "]");
    }
}

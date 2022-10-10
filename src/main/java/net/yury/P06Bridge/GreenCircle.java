package net.yury.P06Bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GreenCircle drawing[radius=" + radius + ";x=" + x + ";y=" + y + "]");
    }
}

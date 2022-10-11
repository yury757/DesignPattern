package net.yury.P19Observer;

public abstract class Observer {
    // 订阅的主体
    protected Subject subject;
    public abstract void update();
}

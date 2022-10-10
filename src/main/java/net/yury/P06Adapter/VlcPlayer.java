package net.yury.P06Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer playing vlc " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new RuntimeException("不支持的媒体类型");
    }
}

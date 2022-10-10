package net.yury.P06Adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        throw new RuntimeException("不支持的媒体类型");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player playing mp4 " + fileName);
    }
}

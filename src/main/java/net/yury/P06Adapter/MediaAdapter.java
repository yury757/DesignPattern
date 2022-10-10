package net.yury.P06Adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equals(audioType)) {
            this.advancedMediaPlayer = new VlcPlayer();
        }else if ("mp4".equals(audioType)) {
            this.advancedMediaPlayer = new Mp4Player();
        }else {
            throw new RuntimeException("不支持的媒体类型");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equals(audioType)) {
            this.advancedMediaPlayer.playVlc(fileName);
        }else if ("mp4".equals(audioType)) {
            this.advancedMediaPlayer.playMp4(fileName);
        }else {
            throw new RuntimeException("不支持的媒体类型");
        }
    }
}

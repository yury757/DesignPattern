package net.yury.P06Adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)) {
            System.out.println("AudioPlayer playing mp3 " + fileName);
        }else {
            MediaPlayer mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}

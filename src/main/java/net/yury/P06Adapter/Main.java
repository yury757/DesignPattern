package net.yury.P06Adapter;

public class Main {
    public static void main(String[] args) {
        final AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "1");
        audioPlayer.play("mp4", "2");
        audioPlayer.play("vlc", "3");
        audioPlayer.play("xxx", "4");
    }
}

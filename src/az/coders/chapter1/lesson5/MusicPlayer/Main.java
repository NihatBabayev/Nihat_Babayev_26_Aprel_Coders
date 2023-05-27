package az.coders.chapter1.lesson5.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        ClassicalMusicPlayer cmp = new ClassicalMusicPlayer();
        JazzMusicPlayer jmp = new JazzMusicPlayer();

        cmp.play();
        cmp.pause();
        cmp.stop();
        cmp.playClassicalMusic();

        jmp.play();
        jmp.pause();
        jmp.stop();
        jmp.playJazzMusic();
    }
}

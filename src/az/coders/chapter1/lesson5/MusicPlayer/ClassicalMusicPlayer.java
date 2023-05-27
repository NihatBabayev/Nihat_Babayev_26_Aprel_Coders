package az.coders.chapter1.lesson5.MusicPlayer;

public class ClassicalMusicPlayer implements MusicPlayer{
    public void playClassicalMusic(){
        System.out.println("Classical music is playing");
    }

    @Override
    public void play() {
        System.out.println("Classical music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Classical music is paused");
    }

    @Override
    public void stop() {
        System.out.println("Classical music is stopped");
    }
}

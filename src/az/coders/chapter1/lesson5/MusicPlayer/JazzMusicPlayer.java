package az.coders.chapter1.lesson5.MusicPlayer;

public class JazzMusicPlayer implements MusicPlayer{


    public void playJazzMusic(){
        System.out.println("Jazz music is playing");
    }

    @Override
    public void play() {
        System.out.println("Jazz music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Jazz music is paused");
    }

    @Override
    public void stop() {
        System.out.println("Jazz music is stopped");
    }
}


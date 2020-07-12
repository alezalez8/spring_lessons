package springTestPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayer {

    //private List<Music> music = new ArrayList<>();

    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void initMy(){
        System.out.println("This is init method of Music class");
    }
    public void destMy(){
        System.out.println("This is destroy method of Music class");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }
    public void setMusic(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Now playing: " + music.getSong());
    }




}

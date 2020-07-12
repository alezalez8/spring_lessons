package springTestPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanClassTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        //System.out.println(classicalMusic.getSong());
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer player = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playListMusic();
        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusic();
        if (firstMusicPlayer.equals(secondMusicPlayer)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println("Hash's of objects are");
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println("Change volume");
        firstMusicPlayer.setVolume(88);
        System.out.println("first player: volume is  " + firstMusicPlayer.getVolume());
        System.out.println("second player: volume is  " + secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close();


    }
}

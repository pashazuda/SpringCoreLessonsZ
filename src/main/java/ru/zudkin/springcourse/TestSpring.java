package ru.zudkin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        ClassicalMusic musicBean1 = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(musicBean1.getSong());
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        musicPlayer.playMusic();
////        System.out.println(musicPlayer.getName());
////        System.out.println(musicPlayer.getVolume());
////          System.out.println(musicPlayer.get)
        context.close();
    }
}


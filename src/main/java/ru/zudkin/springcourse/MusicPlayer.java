package ru.zudkin.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList();
    private String name;
    private  int volume;

//    public Music getMusic() {
//        return music;
//    }

    public String getName() {
        return name;
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

    public MusicPlayer() {}

    //IoC

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}

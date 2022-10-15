package ru.zudkin.springcourse;

import org.springframework.stereotype.Component;

//@Component("musicBean2")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

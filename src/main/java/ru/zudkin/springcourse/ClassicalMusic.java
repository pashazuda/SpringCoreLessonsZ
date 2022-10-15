package ru.zudkin.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }



}

package ru.zudkin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        ClassicalMusic musicBean1 = context.getBean("musicBean1", ClassicalMusic.class);
        RockMusic musicBean2 = context.getBean("musicBean2", RockMusic.class);
        System.out.println(musicBean1.getSong());
        System.out.println(musicBean2.getSong());
        context.close();
    }
}


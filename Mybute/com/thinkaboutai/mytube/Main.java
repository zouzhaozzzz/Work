package com.thinkaboutai.mytube;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("hello.mp4");
        video.setTitle("Hello world");
        video.setUser(new User("jack@gmail.com"));

        var processor = new VideoProcessor();
        processor.process(video);
    }
}

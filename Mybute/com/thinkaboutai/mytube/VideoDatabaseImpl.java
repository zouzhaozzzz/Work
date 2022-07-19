package com.thinkaboutai.mytube;

public class VideoDatabaseImpl implements VideoDatabase{
    public void store(Video video) {
        System.out.println(video.getTitle());
    }
}

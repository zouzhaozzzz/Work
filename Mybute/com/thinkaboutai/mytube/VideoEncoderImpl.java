package com.thinkaboutai.mytube;

public class VideoEncoderImpl  implements VideoEncoder {

    @Override
    public void encode(Video video) {
        System.out.println(video.getFileName());
    }
}

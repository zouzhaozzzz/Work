package com.thinkaboutai.mytube;

public class VideoProcessor {
    VideoEncoder videoEncoder;
    VideoDatabase videoDatabase;
    EmailService emailService;
    public void process(Video video) {
        videoEncoder=new VideoEncoderImpl();
        emailService = new EmailServiceImpl();
        videoDatabase = new VideoDatabaseImpl();

        videoEncoder.encode(video);
        videoDatabase.store(video);
        emailService.sendEmail(video.getUser());
    }
}

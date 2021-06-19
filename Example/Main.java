package com.company.Example;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

import static javax.sound.sampled.AudioSystem.getClip;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       // File file = new File("TunePocket-Dreamy-Intro-Logo-Preview.wav");
        File file = new File("C:/Users/Taron/Desktop/TunePocket-Dreamy-Intro-Logo-Preview.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = getClip();
        clip.open(audioInputStream);
        clip.start();
        audioInputStream.close();
        clip.close();
    }
}

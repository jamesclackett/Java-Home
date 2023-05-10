package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("Java Learning\\resources\\audio\\PinkPanther30.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");

        while (!response.equals("Q")){
            System.out.print("Enter your response: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"):
                    clip.start();
                    System.out.println("\tplaying...");
                    break;
                case ("S"):
                    clip.stop();
                    System.out.println("\tstopping...");
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    System.out.println("\tresetting...");
                    break;
                case ("Q"):
                    clip.close();
                    System.out.println("\texiting........");
                    break;
                default:
                    System.out.println("\tNot a valid response");
            }
        }
    }
}
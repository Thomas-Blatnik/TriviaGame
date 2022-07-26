package Jeopardy.Game.Jeopardy.Game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AudioPlayer {

    public static void playSound(String filePath) {


        File audioFile = new File(filePath);
        Clip clip;

        try (AudioInputStream audio = AudioSystem.getAudioInputStream(audioFile)) {


            try {
                clip = AudioSystem.getClip();

                clip.open(audio);


                clip.start();
            } catch (Exception e) {

            }
        }
        catch (Exception e) {

        }

    }

}

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class GameTest {
   public static void main(String[] args) throws Exception {
      Game myGame = new Game();
      //This gets the path to the project, but not into /src for eclipse
      String path = new File("").getAbsolutePath() + "\\StartScreen.wav";
      //Make a File object with a path to the audio file.
      File sound = new File(path);


      try {
          AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
          Clip c = AudioSystem.getClip();
          c.open(ais); //Clip opens AudioInputStream
          c.start(); //Start playing audio

          //sleep thread for length of the song
          Thread.sleep((int)(c.getMicrosecondLength() * 0.001));

      } 
      catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
   }
}


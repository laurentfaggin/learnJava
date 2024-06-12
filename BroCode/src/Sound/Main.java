package Sound;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("/home/laurent/git/repository/BroCode/src/Sound/Skating_on_the_uppers.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		
		clip.start();
	}

}

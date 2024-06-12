package Sound;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("/home/laurent/git/repository/BroCode/src/Sound/Skating_on_the_uppers.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		
		clip.start();
		
		String response = scanner.next();
	}

}

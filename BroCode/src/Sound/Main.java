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
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S = stop, R = reset, Q = Quit");
			System.out.println("Enter your choice");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("S"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("Q"): clip.close();
				break;
				default: System.out.println("Not a valid response");
			}
		}
		System.out.println("Byeeeeee!");
		
	}

}

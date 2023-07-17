package coreJava;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FileHandle {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		try {
		DataInputStream dis= new DataInputStream(System.in);
		AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\Yashica\\Downloads\\sample.wav"));
		Clip clip = AudioSystem.getClip();
        
        // open audioInputStream to the clip
        clip.open(audioInputStream);
          
     //   clip.loop(Clip.LOOP_CONTINUOUSLY);
       
        clip.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}


package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String catCount = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
	int catCountInt = Integer.parseInt(catCount);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
	if  (catCountInt >= 3) {
		JOptionPane.showMessageDialog(null, "You are a crazy cat person.");
	}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
	else if (catCountInt < 3 && catCountInt > 0) {
		JOptionPane.showMessageDialog(null, "Cat");
	}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
	else if (catCountInt == 0) {
	JOptionPane.showMessageDialog(null, "No cats for you.");
	}
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


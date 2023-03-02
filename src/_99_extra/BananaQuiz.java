
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		int userInput = JOptionPane.showConfirmDialog(null, "Do you like bananas?");
		System.out.print(userInput);
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(userInput == 1) {
			JOptionPane.showMessageDialog(null, "You are bananas.");
			System.exit(0);
		} else if (userInput == 0) {
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
			String userHobby = JOptionPane.showInputDialog(null, "What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, userHobby + " is much better with bananas!");
		} else {
		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
			JOptionPane.showMessageDialog(null, "You are bananas, answer with a yes or no!");
		}
	}

}

package _01_else_if._5_own_adventure;


import javax.swing.JOptionPane;

public class OwnAdventure{
	public static void main(String[] args) {
		//start of the story
		int playerHealth = 100;
		int enemyHealth = 100;
		JOptionPane.showMessageDialog(null, "You are on a adventure to find the lost scroll needed to create the perfect cheeseburger. \n It is your job to navigate through the dungeon and find the lost recipe. \n You will have options to pick your next action while traversing through the dungeon.");
		//starting the adventure
		Object[] optionArray = {"Enter the Dungeon", "Gain More Information"};
		int query = JOptionPane.showOptionDialog(null, "Greetings, I am Timmy Bobby Joe, your aid and will guide you in your adventure. \n Do you wish to go in?", null, 0, 1, null, optionArray, "Enter the Dungeon");
		if(query == 1) {
			JOptionPane.showMessageDialog(null, "You must be full of questions, like why am I here or why are there no pictures. \n However, I will be here to guide you on this adventure. \n Okay, let's go in.");
		}
		Object [] optionArray2 = {"Attack", "Run through", "Run out in fear"};	
		query = JOptionPane.showOptionDialog(null, "You and Timmy have encoutered a small hoard of slimes and small goblins. \n Choose your action", null, 0, 1, null, optionArray2, "Attack");
		if(query == 0) {
			JOptionPane.showMessageDialog(null, "You take your shield and sword out of your imaginary inventory item. Prepare for combat.");
			optionArray2[0] = "Slash";
			optionArray2[1] = "Punch";
			optionArray2[2] = "Block";
			while(enemyHealth > 0 || playerHealth > 0) {
				query = JOptionPane.showOptionDialog(null, "Pick option", null, 0, 1, null, optionArray2, "Slash");
				if (query == 0) {
					enemyHealth = enemyHealth - 10;
				} else if (query == 1) {
					enemyHealth = enemyHealth - 6;
				} else if (query == 2) {
					
				}
				JOptionPane.showMessageDialog(null, "Player Health: " + playerHealth + "\n Enemy Health: " + enemyHealth);
			}
		} else if (query == 2) {
			JOptionPane.showMessageDialog(null, "You try to run toward the enterance, but goblins surround you. You are forced into combat. \n Then, Timmy jumps in and defeats some of the creatures until he dies. This moment of sacrifice allows you to escape the dungeon.");
			JOptionPane.showMessageDialog(null, "You failed to obtain the secret recipe. You lose.");
		} else if (query == 1) {
			JOptionPane.showMessageDialog(null, "You try to bash through the mob of small monsters. However you are unable to breakthough, \n resulting to you and Timmy being crushed to death.");
			JOptionPane.showMessageDialog(null, "You lose.");
		}
	}
}
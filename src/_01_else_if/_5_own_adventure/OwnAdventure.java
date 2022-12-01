package _01_else_if._5_own_adventure;


import javax.swing.JOptionPane;

public class OwnAdventure{
	public static void main(String[] args) {
		//start of the story
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
			
			JOptionPane.showMessageDialog(null, "You take your shield out of your imaginary inventory item ");
		}
	}
}
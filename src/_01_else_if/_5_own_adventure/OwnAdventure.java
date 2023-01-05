package _01_else_if._5_own_adventure;


import java.util.Random;

import javax.swing.JOptionPane;

public class OwnAdventure{
	public static void main(String[] args) {
		//start of the story text and set up stats
		int playerHealth = 100;
		int enemyHealth = 100;
		JOptionPane.showMessageDialog(null, "You are on a adventure to find the lost scroll needed to create the perfect cheeseburger. \n It is your job to navigate through the dungeon and find the lost recipe. \n You will have options to pick your next action while traversing through the dungeon.");
		//starting the adventure, first choice
		Object[] optionArray = {"Enter the Dungeon", "Gain More Information"};
		int query = JOptionPane.showOptionDialog(null, "Greetings, I am Timmy Bobby Joe, your aid and will guide you in your adventure. \n Do you wish to go in?", null, 0, 1, null, optionArray, "Enter the Dungeon");
		//Gain Info
		if(query == 1) {
			JOptionPane.showMessageDialog(null, "You must be full of questions, like why am I here or why are there no pictures. \n However, I will be here to guide you on this adventure. \n Okay, let's go in.");
		}
		Object [] optionArray2 = {"Attack", "Run through", "Run out in fear"};	
		query = JOptionPane.showOptionDialog(null, "You and Timmy have encoutered a small hoard of slimes and small goblins. \n Choose your action", null, 0, 1, null, optionArray2, "Attack");
		//Attack route
		if(query == 0) {
			JOptionPane.showMessageDialog(null, "You take your shield and sword out of your imaginary inventory item. Prepare for combat.");
			optionArray2[0] = "Slash";
			optionArray2[1] = "Punch";
			optionArray2[2] = "Block";
			int loserIndicator = 0;
			while(loserIndicator == 0) {
				query = JOptionPane.showOptionDialog(null, "Pick option", null, 0, 1, null, optionArray2, "Slash");
				//Enemy attack
				int enemyAttack = new Random().nextInt(15);
				//Player Attack choice
				if (query == 0) {
					enemyHealth = enemyHealth - 10;
				} else if (query == 1) {
					enemyHealth = enemyHealth - 6;
				} else if (query == 2) {
					enemyAttack = enemyAttack - (enemyAttack/2);
				}
				playerHealth = playerHealth - enemyAttack;
				//Display health
				JOptionPane.showMessageDialog(null, "Player Health: " + playerHealth + "\n Enemy Health: " + enemyHealth);
				//End the loop
				if(enemyHealth <= 0) {
					loserIndicator++;
				} else if (playerHealth <= 0) {
					loserIndicator++;
				}
			}
		//Run away route
		} else if (query == 2) {
			JOptionPane.showMessageDialog(null, "You try to run toward the enterance, but goblins surround you. You are forced into combat. \n Then, Timmy jumps in and defeats some of the creatures until he dies. This moment of sacrifice allows you to escape the dungeon.");
			JOptionPane.showMessageDialog(null, "You failed to obtain the secret recipe. You lose.");
			System.exit(0);
		//Bash in route
		} else if (query == 1) {
			JOptionPane.showMessageDialog(null, "You try to bash through the mob of small monsters. However you are unable to breakthough, \n resulting to you and Timmy being crushed to death.");
			JOptionPane.showMessageDialog(null, "You lose.");
			System.exit(0);
		}
		//Setting up the Final Battle
		JOptionPane.showMessageDialog(null,  "Timmy: That was a close one, here take some healing potions."
				+ "\n You and Timmy travel further down the lair eventually reaching the bottom, where the \n"
				+ " mysterious being named the Necroking lives. It automatically targets Timmy, leaving him \n"
				+ " in a fatal position. You use your imagination to take out the holy sword Excalibur to "
				+ "oppose the Evil Force. "
				+ "\n Prepare for combat.");
		//Reconfiguring the stats and attacks
		playerHealth = 100;
		enemyHealth = 1000;
		int enemyAttack = 0;
		int loserIndicator = 0;
		int critIndicator = 0;
		optionArray2[0] = "Godly Slashes";
		optionArray2[1] = "Divine Divider";
		optionArray2[2] = "Holy Barrier";
		//Object [] enemyArray = {"Demonic Flames", "Shadow Pool", "Pure Darkness"};	
		while(loserIndicator == 0) {
			query = JOptionPane.showOptionDialog(null, "Pick option", null, 0, 1, null, optionArray2, "Godly Slashes");
			int enemyAttackChoice = new Random().nextInt(101);
			if(enemyAttackChoice >= 90) {
			//Pure Darkness
				enemyHealth = enemyHealth + (enemyHealth/10);
				enemyAttack = new Random(20).nextInt(61);
			} else if (enemyAttackChoice >= 70) {
			//Shadow Pool
				enemyHealth = enemyHealth + (enemyHealth/20);
				enemyAttack = new Random(10).nextInt(31);
			} else {
			//Demonic Flames
				enemyAttack = new Random(10).nextInt(21);
			}
			if(query == 0) {
				int slashesDamage = new Random().nextInt(16);
				if(new Random().nextInt(101)>= 75) {
					slashesDamage = slashesDamage*2;
					critIndicator = 1;
				}
				enemyHealth = enemyHealth - (8*(slashesDamage));
			} else if (query == 1) {
				int beamDamage = new Random().nextInt(6);
				if(new Random().nextInt(101)>= 75) {
					beamDamage = beamDamage*2;
					critIndicator = 1;
				}
				enemyHealth = enemyHealth - (50*(beamDamage));
			} else if (query == 2) {
				enemyAttack = 5;
				int barrierDamage = new Random().nextInt(5);
				enemyHealth = enemyHealth-barrierDamage;
			}
			if(enemyHealth <= 0) {
				JOptionPane.showMessageDialog(null, "You did it, the ruler of under has been "
						+ "defeated, as you saw him fall, he turned into a scroll.\n"
						+ "You unravel the scroll, written on the scroll is the secret recipe for"
						+ "the perfect cheeseburger. \n you then see Timmy impaled by a big sharp rock"
						+ "you desperately try to save him. With his last beath he says... \n"
						+ "Timmy: Use... Your ... Sword... \n With this you reach for your sword"
						+ "place it on the gaping wound. Then like magic the wound seals and Timmy is brought back to life."
						+ "Overjoyed you both hop on one foot back to the entrance of the dungeon."
						+ "You then ask ... \n You: How did you know the sword will heal you? \n he responds...\n"
						+ "Timmy: I didn't know I just wanted to die while hugging a sword. \n Concluding your legend of conquering the dungeon with Timmy Bobby Joe.");
				System.exit(0);
			} else if (playerHealth <= 0) {
				
				
			}
		}
	}
}
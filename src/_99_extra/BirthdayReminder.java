
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 2nd";
		String dadsBirthday = "November 30th";
		String myBirthday = "May 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String desiredBirthday = JOptionPane.showInputDialog(null, "Who's birthday do you want to see?");
		// 3. Print out what the user typed
	if(desiredBirthday.equalsIgnoreCase("my")) {
		JOptionPane.showMessageDialog(null, "You are looking for my birthday");
	} else {
	JOptionPane.showMessageDialog(null, "You are looking for " + desiredBirthday + "'s birthday");
	}	
	// 4. if user asked for "mom"
			//print mom's birthday
	if (desiredBirthday.equalsIgnoreCase("mom")) {
	JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	else if (desiredBirthday.equalsIgnoreCase("dad")) {
		JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
	else if (desiredBirthday.equalsIgnoreCase("my")) {
		JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
	} 
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		
	}
	} 
}

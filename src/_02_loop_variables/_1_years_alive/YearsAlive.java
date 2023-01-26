package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive{
	public static void main(String[] args) {
		
	String userAge = JOptionPane.showInputDialog(null, "Enter your Age");
	String userBirthYear = JOptionPane.showInputDialog(null, "What year were you born?");
	int userBirthInt = Integer.parseInt(userBirthYear);
	int userAgeInt = Integer.parseInt(userAge);
	System.out.println(userBirthInt);
	
	/*
	while(userAgeInt >= 0) {
		userAgeInt = userAgeInt - 1;
		userBirthInt = userBirthInt + 1;
		System.out.println(userBirthInt);
	}
	*/
	
	for(int i = 0; i < userAgeInt; i++) {
		userBirthInt++;
		System.out.println(userBirthInt);
	}
	
	
	}
}
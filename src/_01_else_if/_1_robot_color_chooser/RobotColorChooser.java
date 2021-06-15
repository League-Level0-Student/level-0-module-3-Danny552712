
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot bob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		for (int loop = 0; loop < 10; loop++) {
		String penColor = JOptionPane.showInputDialog("What is you favorite color?");
        
		
		//3. Set the pen width to 10
		
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
        if(penColor .equals ("green")) {
        	bob.setPenColor(0,250,0);
        }
        else if (penColor.equals("blue")) {
        	bob.setPenColor(0,0,250);
        }
        else if (penColor.equals("red")) {
        	bob.setPenColor(250,0,0);
        }
        else if (penColor.equals("yellow")) {
        	bob.setPenColor(250,250,0);
        }
        else if (penColor.equals("orange")) {
        	bob.setPenColor(250,150,0);
        }
        else if (penColor.equals("purple")) {
        	bob.setPenColor(200,0,250);
        }
        else if (penColor.equals("pink")) {
        	bob.setPenColor(250,0,200);
        }
        else if (penColor.equals("white")) {
        	bob.setPenColor(250,250,250);
        }
        else if (penColor.equals("black")) {
        	bob.setPenColor(0,0,0);
        }
		//6. If the user doesn't enter anything, choose a random color
        else {
        	bob.setRandomPenColor();
        }
        
        bob.setPenWidth(10);
        bob.penDown();
		bob.setSpeed(50);
		bob.hide();
		bob.move(160);
		bob.turn(120);
		bob.move(160);
		bob.turn(120);
		bob.move(160);
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}
        
		



	}
}

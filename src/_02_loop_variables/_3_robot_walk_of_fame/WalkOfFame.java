
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.hide();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setX(10);
rob.setSpeed(100);
		// 2. Make the robot draw a star shape. Hint: angle=144.
rob.penDown();
/*for(int i = 0; i < 5;i++) {
rob.turn(144);
		// 3. Set the length of each line in the star to 30.
rob.move(30);
}
*/
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */
//Loop for the ten stars
for(int j = 0; j < 10; j++) {
	
//for one star
for(int i = 0; i < 5;i++) {
rob.turn(144);
rob.move(30);
}
//relocating the robot
int currentX = rob.getX();
rob.setX(currentX+50);
}
rob.show();
	}

}

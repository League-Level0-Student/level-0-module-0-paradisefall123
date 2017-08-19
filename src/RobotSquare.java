import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot bob = new Robot();

		// 3. Put the robot's pen down

		bob.penDown();

		// 6. Make the robot move as fast as possible
           bob.setSpeed(500);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {

		

		// 2. Move your robot 200 pixels

		bob.move(200);

		// 4. Turn the robot 90 degrees to the right (90 degrees)
		bob.turn(90);
		
		}bob.move(200);
		bob.turn(55);
		bob.move(100);
		bob.turn(60);
		bob.move(100);
	}
}

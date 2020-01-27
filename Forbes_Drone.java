import java.util.Scanner;

/*
 * Author Name: Renford Forbes
 * Date: 1/14/2020
 * Program Name: Forbes_Drone
 * Purpose: Simulation using button, drone movement in x, y, z location
 */
public class Forbes_Drone {

	public static void main(String[] args) {
		// Create scanner
		Scanner drone = new Scanner(System.in);

		// initialize int variable types
		int choice;
		int x_pos = 0;
		int y_pos = 0;
		int z_pos = 0;

		// Create while loop
		while (true) {

			// Display menu options
			System.out.println("Which direction would you like to move the drone?");
			System.out.println("1 - Move Up");
			System.out.println("2 - Move Down");
			System.out.println("3 - Move Forward");
			System.out.println("4 - Move Backward");
			System.out.println("5 - Turn Left");
			System.out.println("6 - Turn Right");
			System.out.println("7 - Display Position");
			System.out.println("8 - Exit Navigation");

			choice = drone.nextInt();

			// Switch with int data type
			switch (choice) {

			// Increment drone up
			case 1:
				System.out.println("You have moved up");
				++y_pos;
				break;

			// Decrement drone down
			case 2:
				System.out.println("You have moved down");
				--y_pos;
				break;

			// Increment drone forward
			case 3:
				System.out.println("You have moved forward");
				++z_pos;
				break;

			// Decrement drone backward
			case 4:
				System.out.println("You have moved backward");
				--z_pos;
				break;

			// Decrement drone left
			case 5:
				System.out.println("You have moved left");
				--x_pos;
				break;

			// Increment drone right
			case 6:
				System.out.println("You have moved right");
				++x_pos;
				break;

			// Display position of x, y, and z
			case 7:
				System.out.println("[x_pos = " + x_pos + ", y_pos = " + y_pos + ", z_pos = " + z_pos + "]");
				break;

			// Exit drone navigation
			case 8:
				System.out.println("Exiting navigation");
				System.exit(0);
				break;
			// Show error for invalid entries
			default:
				System.out.println("This is not a valid menu option! Please select another");
				break;
			}
		}

	}
	// drone.close();

}

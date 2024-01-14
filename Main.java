import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gridSize = 0;

		while (true) {
			System.out.print("Grid size: ");
			if (scanner.hasNextInt()) {
				gridSize = scanner.nextInt();
				if (gridSize > 0) {
					break;
				}
				System.out.println("Please enter a positive number.");
			} else {
				System.out.println("Invalid input. Please enter a number.");
				scanner.next();
			}
		}

		scanner.close();

		Grid grid = new Grid(gridSize);
		grid.printGrid();
	}
}
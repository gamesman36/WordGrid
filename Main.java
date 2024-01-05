import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Grid size: ");
		int gridSize = scanner.nextInt();
		scanner.close();
		
		Grid grid = new Grid(gridSize);
		ArrayList<Point> points = grid.getPoints();
	}
}
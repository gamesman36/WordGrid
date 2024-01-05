import java.util.ArrayList;
import java.util.Random;

public class Grid {
	private int size;
	private ArrayList<Point> points;
	
	Grid(int size) {
	    this.size = size;
	    points = new ArrayList<Point>();
	    
	    System.out.println("Creating grid with size " + size + ":");

	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            char randomChar = getRandomChar();
	            Point point = new Point(i, j, randomChar);
	            points.add(point);
	        }
	    }
	}
	
	public char getRandomChar() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}
	
	public ArrayList<Point> getPoints() {
		return points;
	}
}
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

	public void printGrid() {
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < size; j++) {
				for(Point point : points) {
					if(point.getXValue() == i && point.getYValue() == j) {
						System.out.print(point.getContent() + " ");
						break;
					}
				}
			}
			System.out.println();
		}
	}

	public Point walkGrid(int xValue, int yValue, String direction, Grid grid) {
		switch(direction) {
			case "up":
				yValue++;
				break;
			case "down":
				yValue--;
				break;
			case "left":
				xValue--;
				break;
			case "right":
				xValue++;
				break;
		}

		for(Point point : grid.getPoints()) {
			if(point.getXValue() == xValue && point.getYValue() == yValue)
				return point;
		}

		return new Point(0,0,'x');
	}

	public ArrayList<Point> getPoints() {
		return points;
	}
}
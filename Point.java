
public class Point {
	private int xValue;
	private int yValue;
	private char content;
	
	Point(int x, int y, char c) {
		xValue = x;
		yValue = y;
		content = c;
	}
	
	public int getXValue() {
		return xValue;
	}
	
	public int getYValue() {
		return yValue;
	}
	
	public char getContent() {
		return content;
	}
}
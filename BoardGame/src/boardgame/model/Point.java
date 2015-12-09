package boardgame.model;

public class Point {
	private final int rowNumber;
	private final int columnNumber;
	
	public Point(int rowNumber, int columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}
	
	public int getRowNumber() {
		return rowNumber;
	}
	
	public int getColumnNumber() {
		return columnNumber;
	}
}

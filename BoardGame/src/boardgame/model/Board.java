package boardgame.model;

public interface Board {
	public int getHeight();
	public int getWidth();
	public Figure getFigureAt(int rowNum, int colNum);
	public void setFigureAt(int rowNum, int colNum, Figure figure);
	public boolean isFigureSet(int rowNum, int colNum);
}

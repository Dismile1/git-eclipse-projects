package boardgame.model;

public interface Board {
	public int getHeight();
	public int getWidth();
	public Figure getFigureAt(Point point);
	public void setFigureAt(Point point, Figure figure);
	public boolean isFigureSet(Point point);
}

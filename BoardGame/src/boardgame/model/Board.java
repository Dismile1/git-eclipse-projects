package boardgame.model;

public interface Board {
	public int getHeight();
	public int getWidth();
	public Figure getFigureAt(final Point point);
	public void setFigureAt(final Point point, final Figure figure);
	public boolean isFigureSet(final Point point);
}

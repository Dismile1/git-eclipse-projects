package boardgame.model;

public interface IBoard {
	public int getHeight();
	public int getWidth();
	public IFigure getFigureAt(int rowNum, int colNum);
	public void setFigureAt(int rowNum, int colNum, IFigure figure);
	public boolean isFigureSet(int rowNum, int colNum);
}

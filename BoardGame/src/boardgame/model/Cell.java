package boardgame.model;

public class Cell {
	IFigure figure;
	
	public Cell() {
		figure = null;
	}
	
	public Cell(final IFigure figure) {
		this.figure=figure;
	}
	public IFigure getFigure() {
		return figure;
	}
	
	public void setFigure(final IFigure figure) {
		this.figure=figure;
	}
	
	public boolean isSet() {
		return figure!=null;
	}
}

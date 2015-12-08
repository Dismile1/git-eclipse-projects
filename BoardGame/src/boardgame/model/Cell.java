package boardgame.model;

public class Cell {
	Figure figure;
	
	public Cell() {
		figure = null;
	}
	
	public Cell(final Figure figure) {
		this.figure=figure;
	}
	public Figure getFigure() {
		return figure;
	}
	
	public void setFigure(final Figure figure) {
		this.figure=figure;
	}
	
	public boolean isSet() {
		return figure!=null;
	}
}

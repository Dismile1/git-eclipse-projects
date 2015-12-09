package xogame.model;

import boardgame.model.Cell;
import boardgame.model.Board;
import boardgame.model.Figure;
import boardgame.model.Point;

public class BoardXO implements Board {
	
	private final int height;
	private final int width;
	private final Cell[][] cells;
	
	public BoardXO() {
		height = Constants.DEFAULT_BOARD_SIZE;
		width = Constants.DEFAULT_BOARD_SIZE;
		cells = new Cell[height][width];
		fillWithEmptyCells();
	}
	
	public BoardXO(int height, int width) {
		this.height = height;
		this.width = width;
		cells = new Cell[this.height][this.width];
		fillWithEmptyCells();
	}
	
	private void fillWithEmptyCells() {
		for(int i = 0; i<height; i++) {
			for(int j=0; j<width; j++) {
				cells[i][j] = new Cell();
			}
		}
	}
	
	public void clearBoard() {
		for(int i = 0; i<height; i++) {
			for(int j=0; j<width; j++) {
				cells[i][j].setFigure(null);
			}
		}
	}
	

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public Figure getFigureAt(final Point point) {
		int row = point.getRowNumber();
		int col = point.getColumnNumber();
		return cells[row][col].getFigure();
	}

	@Override
	public void setFigureAt(final Point point, final Figure figure) {
		int row = point.getRowNumber();
		int col = point.getColumnNumber();
		cells[row][col].setFigure(figure);
	}

	@Override
	public boolean isFigureSet(final Point point) {
		int row = point.getRowNumber();
		int col = point.getColumnNumber();
		return cells[row][col].isSet();
	}

}

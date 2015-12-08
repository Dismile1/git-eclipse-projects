package xogame.model;

import boardgame.model.Cell;
import boardgame.model.Board;
import boardgame.model.Figure;

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
	

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public Figure getFigureAt(int rowNum, int colNum) {
		return cells[rowNum][colNum].getFigure();
	}

	@Override
	public void setFigureAt(int rowNum, int colNum, Figure figure) {
		cells[rowNum][colNum].setFigure(figure);
	}

	@Override
	public boolean isFigureSet(int rowNum, int colNum) {
		return cells[rowNum][colNum].isSet();
	}

}

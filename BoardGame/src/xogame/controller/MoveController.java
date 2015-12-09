package xogame.controller;

import boardgame.model.Point;
import xogame.exceptions.AlreadyOccupiedCellException;
import xogame.exceptions.OutOfBoardMoveException;
import xogame.model.GameXO;

public class MoveController {
	private final GameXO gameXO;
	
	public MoveController(GameXO gameXO) {
		this.gameXO = gameXO;
	}
	
	public void applyMove(final Point point) throws OutOfBoardMoveException, AlreadyOccupiedCellException {
		validatePointCoordinates(point);
		validatePointOccupation(point);		
	}
	
	private boolean isPointCorrect(final Point point) {
		int row = point.getRowNumber();
		int col = point.getColumnNumber();
		if(row >= 0 && row <= gameXO.getBoardHeight() &&
				col >= 0 && col <= gameXO.getBoardWidth()) {
			return true;
		}
		else {
			return false;
			}
	}
	
	private void validatePointCoordinates(final Point point) throws OutOfBoardMoveException {
		if(!isPointCorrect(point))
			throw new OutOfBoardMoveException();
	}
	
	private void validatePointOccupation(final Point point) throws AlreadyOccupiedCellException {
		if(gameXO.isFigureSet(point)) {
			throw new AlreadyOccupiedCellException();
		}
	}
}
